rootProject.name = "reproducer-project"

val anInt: Int by settings
val aBoolean: Boolean by settings
val aString: String by settings

println("Safe so far")

println(aString)

println("Still Safe")

println(aBoolean)
