organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-1f377c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-64b823",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-c467f0",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-313266",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-7a68f8",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-742c43",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-7d403a",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        