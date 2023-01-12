organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.2-d3e278"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-532438",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-792eea",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-643c99",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-1db860",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-26f92a",
  "org.scalablytyped" %%% "aurelia-templating" % "1.11.1-3dc73f",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
