organization := "com.scalablytyped"
name := "aframe"
version := "0.8-dt-20180915Z-055d2a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "three" % "0.93-dt-20181205Z-fcd7e3",
  "com.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180910Z-27269c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        