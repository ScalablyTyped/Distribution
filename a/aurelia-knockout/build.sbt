organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-df91a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.2.0-acf0de",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-60a807",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.1-64c5e9",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-f3ae52",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-6dabb5",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-0e4bd7",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-45815e",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-2f3a80",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-3e2dac",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190218Z-a6b42e",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        