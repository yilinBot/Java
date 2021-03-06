package person;

public class Person{
    private String lname;
    private String fname;
    private String occupation;
    private Gender gender;
    private int birthYear;

    public Person(String lname, String fname, String occupation, Gender gender, int birthYear) {
        this.lname  = lname;
        this.fname = fname;
        this.occupation = occupation;
        this.gender    = gender;
        this.birthYear = birthYear;
    }

    public boolean equals(Person p) {
        return (p != null) && (p.lname.equals(lname)) && (p.fname.equals(fname)) && (p.occupation.equals(occupation)) && (p.gender == gender) && (p.birthYear == birthYear);
    }

    public String toString() {
        return fname +" "+ lname +" "+ occupation +" "+ gender +" "+ birthYear;
    }
}
