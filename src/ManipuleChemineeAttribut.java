public class ManipuleChemineeAttribut implements Appareil{
    private Cheminee cheminee;

    public ManipuleChemineeAttribut(Cheminee cheminee){
        this.cheminee = cheminee;
    }

    public void allumer(){
        cheminee.changerIntensite(cheminee.getLumiere() + 10);
    }

    public void eteindre(){
        cheminee.changerIntensite(0);
    }

    public Cheminee getCheminee() {
        return cheminee;
    }

    @Override
    public String toString() {
        return cheminee.toString();
    }
}
