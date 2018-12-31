organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.1.7-ebcbe9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-4b8c7a",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-ebfa66",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-4d658c",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-a063fd",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-a4242c",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        