organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.2.0-e83e45"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-0ca32b",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-85400f",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-1d0978",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-e402c1",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-b73df8",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        