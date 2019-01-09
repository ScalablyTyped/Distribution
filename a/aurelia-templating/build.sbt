organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.1-e1c971"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-e21b58",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-8e83ac",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-b8844c",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-0d1d55",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-a79982",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-d5180d",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-203d22",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-8eb8dd",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        