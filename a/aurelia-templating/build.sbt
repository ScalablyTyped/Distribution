organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.11.1-91dd6e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-e547db",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-911e1b",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-34d51a",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-e13563",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-079119",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
