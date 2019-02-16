organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-9f8b1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-d44cf4",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-fe3360",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-4a819c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-b41a75",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-7f9738",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-8012c5",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-b90d36",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-35e092",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        