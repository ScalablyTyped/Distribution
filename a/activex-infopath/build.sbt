organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-5d4043"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-e333f0",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-788d68",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-ab6f38",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-8584b0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        