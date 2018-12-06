organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20180915Z-ccfcfb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "three" % "0.93-dt-20181205Z-f9e838",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180910Z-45906e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        