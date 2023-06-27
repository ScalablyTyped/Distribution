organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.11.1-dfc6ec"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-2da575",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-78914c",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-08f4ee",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-efaf0e",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-b3d609",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
