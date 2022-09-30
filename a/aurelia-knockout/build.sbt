organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.2-a86934"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-40b065",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-d9d850",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-6aef08",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-1aecbd",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-a6ab9e",
  "org.scalablytyped" %%% "aurelia-templating" % "1.11.1-ca56f5",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
