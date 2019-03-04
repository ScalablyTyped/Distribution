organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-b0ac19"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-64b823",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-90de75",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-c467f0",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-313266",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-3bf621",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-03b12d",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-7d403a",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-31a67f",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        