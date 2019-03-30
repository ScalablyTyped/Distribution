organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.3.0-28c01e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-7d1364",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.2-ca0f88",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-9c33a7",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.2-da00e5",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-7b4202",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        