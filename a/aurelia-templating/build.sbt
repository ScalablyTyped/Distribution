organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-3af808"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.0-690885",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-3780cc",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-eb3099",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-472647",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-a4504e",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        