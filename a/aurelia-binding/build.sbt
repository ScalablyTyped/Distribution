organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.1.7-dd2866"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.1-e20a2a",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-519238",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-b2a725",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-84932f",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-85bae5",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        