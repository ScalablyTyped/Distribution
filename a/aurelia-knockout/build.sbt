organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.2-523aee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-1f29ae",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-09ee32",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-d9d53f",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-1cd15b",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-3f30ab",
  "org.scalablytyped" %%% "aurelia-templating" % "1.11.1-b300cd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
