organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-9578ce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-104836",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-0f4b27",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-5c2e59",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-59b08e",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-540190",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-e4eadf",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-6f8f52",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-c0481d",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-499684",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-ef5c46",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        