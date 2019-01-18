organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.1.7-104836"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-0f4b27",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-59b08e",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-540190",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-e4eadf",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-c0481d",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        