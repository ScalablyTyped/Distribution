organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-a6f6d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-ee2a72",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-e1a5a7",
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
        