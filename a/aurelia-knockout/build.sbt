organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.2-b30279"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-2cfe4d",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-d5d837",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-10b1e6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-a76691",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-35f228",
  "org.scalablytyped" %%% "aurelia-templating" % "1.11.1-e02a44",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
