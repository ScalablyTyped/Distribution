organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-fb8172"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.2.1-9b474a",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-9120b6",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.1-5ccb40",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.2-6be3b2",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-86c8d7",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.2-da1c35",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-510524",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-083f96",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-e89a17",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190322Z-ce3980",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        