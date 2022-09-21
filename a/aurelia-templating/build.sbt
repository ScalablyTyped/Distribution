organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.11.1-cfcca9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-2edddb",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-4ba344",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-050a71",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-2d3939",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-c996db",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
