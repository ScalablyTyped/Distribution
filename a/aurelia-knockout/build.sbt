organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-52a3c1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-5b2bc3",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-fe268e",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-1aa587",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-8f5c8f",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-aa315b",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-4cff63",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-a0edac",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-5b85a9",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-689f39",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20181221Z-4253f3",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        