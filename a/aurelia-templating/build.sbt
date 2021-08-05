organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.4-a1a3ea"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-af8ff0",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-46b6ea",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-fd6808",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-70eb08",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-73433e",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
