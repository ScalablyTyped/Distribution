organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20181220Z-39f2c7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "three" % "0.93-dt-20181225Z-9c3e69",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180214Z-c8aab5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        