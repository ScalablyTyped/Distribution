organization := "com.scalablytyped"
name := "aurelia-binding"
version := "2.1.6-b1b2f3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.1-8261f2",
  "com.scalablytyped" %%% "aurelia-logging" % "1.5.0-eb7f78",
  "com.scalablytyped" %%% "aurelia-metadata" % "1.0.4-f17f7c",
  "com.scalablytyped" %%% "aurelia-pal" % "1.8.0-c82b71",
  "com.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-b6642f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        