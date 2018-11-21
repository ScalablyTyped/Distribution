organization := "com.scalablytyped"
name := "aurelia-binding"
version := "2.1.5-b676cb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.1-26f903",
  "com.scalablytyped" %%% "aurelia-logging" % "1.5.0-a4c09d",
  "com.scalablytyped" %%% "aurelia-metadata" % "1.0.4-6ad5fe",
  "com.scalablytyped" %%% "aurelia-pal" % "1.8.0-27f003",
  "com.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-c3d6e2",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        