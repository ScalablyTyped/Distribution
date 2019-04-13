organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20190213Z-94e7e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-e333f0",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-4023dd",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-ac38e3",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-2dee02",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-8584b0",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-bec80d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        