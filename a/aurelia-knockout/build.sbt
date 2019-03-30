organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-1797c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.0-28c01e",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-7d1364",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-db0d91",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.2-ca0f88",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-9c33a7",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.2-da00e5",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.3-cb5257",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-7b4202",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-cb82ff",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190322Z-5d9cf1",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        