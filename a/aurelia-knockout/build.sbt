organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-009afb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-ac9fef",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.1-04de4f",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-ef3ba4",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-8f3e3c",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-fb3c81",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-fa3a3e",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-3f2465",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-37de3e",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-80d79f",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20181120Z-86a7d3",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        