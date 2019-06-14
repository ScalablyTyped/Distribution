organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-fb4758"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-875ad4",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-3ff579",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-10dba5",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-ded4b8",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-5144ec",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-1b4964",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        