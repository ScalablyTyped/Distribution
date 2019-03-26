organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.2.1-9b474a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-9120b6",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.2-6be3b2",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-86c8d7",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.2-da1c35",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-083f96",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        