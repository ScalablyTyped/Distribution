organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.1.7-5b2bc3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-fe268e",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-8f5c8f",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-aa315b",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-4cff63",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-5b85a9",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        