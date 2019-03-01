organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.2.0-12620e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-2bf4a6",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-713b2c",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-3c603b",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-ed1e26",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-71f4d2",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        