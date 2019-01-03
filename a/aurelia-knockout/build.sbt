organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-242d81"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-ebcbe9",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-4b8c7a",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-45326b",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-ebfa66",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-4d658c",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-a063fd",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-035fa3",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-a4242c",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-cd2f0a",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-014288",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        