organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.4-57bc4b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-806261",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-ef022c",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-c349c1",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-e48e50",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-a477f9",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
