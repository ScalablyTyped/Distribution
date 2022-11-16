organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.11.1-fd3a3b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-1c0f61",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-be6072",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-ae9702",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-79e910",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-221c43",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
