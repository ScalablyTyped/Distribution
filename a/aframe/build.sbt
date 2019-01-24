organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20190108Z-cd6ae5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "three" % "0.93-dt-20190123Z-ea1a0e",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180214Z-7cba35")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        