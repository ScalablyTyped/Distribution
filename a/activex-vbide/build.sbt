organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20190213Z-35e092"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-4a819c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-b41a75",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-7f9738",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-8012c5",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-b90d36",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        