organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-c2588a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.2.0-e83e45",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-0ca32b",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.1-97f0b5",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-85400f",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-1d0978",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-e402c1",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-acabaf",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-b73df8",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-451b4e",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-ee7cdc",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        