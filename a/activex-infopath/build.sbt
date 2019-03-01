organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-9464ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-f115f0",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-0a404f",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-9f0ec5",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-cfd2d3",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-a756c4",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-7f78cc",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        