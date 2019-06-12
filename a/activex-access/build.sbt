organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20190213Z-b2288f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-a5ad82",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-d50c52",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-aeb5f4",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-d68760",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-0b7200",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-8b9ad5",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        