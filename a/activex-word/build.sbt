organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20190213Z-c3b735"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-4667b7",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-0aec37",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-bf4648",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-84e102",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        