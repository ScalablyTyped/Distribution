organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20180915Z-a7bd6d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "three" % "0.93-dt-20181214Z-5c63c5",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180910Z-15ef5c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        