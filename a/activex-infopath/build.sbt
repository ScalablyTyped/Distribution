organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-bd73f6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-d44cf4",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-4a819c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-b41a75",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-24d290",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-079087",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-b90d36",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        