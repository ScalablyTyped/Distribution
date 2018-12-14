organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20180915Z-5b0c9c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "three" % "0.93-dt-20181214Z-2c9cdf",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180910Z-f2c410")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        