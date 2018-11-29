organization := "com.scalablytyped"
name := "aurelia-templating"
version := "1.10.1-2797fd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aurelia-binding" % "2.1.6-5f89ef",
  "com.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.1-384685",
  "com.scalablytyped" %%% "aurelia-loader" % "1.0.0-266e26",
  "com.scalablytyped" %%% "aurelia-logging" % "1.5.0-22d330",
  "com.scalablytyped" %%% "aurelia-metadata" % "1.0.4-ff9fdd",
  "com.scalablytyped" %%% "aurelia-pal" % "1.8.0-c825ad",
  "com.scalablytyped" %%% "aurelia-path" % "1.1.1-515b38",
  "com.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-c378a0",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        