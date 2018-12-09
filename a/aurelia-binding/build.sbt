organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.1.7-16f52e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.1-d55e96",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-fd537a",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-ce5daf",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-c88d1b",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-fed4a5",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        