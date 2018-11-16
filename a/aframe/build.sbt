organization := "com.scalablytyped"
name := "aframe"
version := "0.8-dt-20181102Z-d0ebc5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "three" % "0.93-dt-20181116Z-8a34f1",
  "com.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20181102Z-2afba4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        