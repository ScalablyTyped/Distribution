organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.11.1-74dc4a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-034f8f",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-4a043b",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-524946",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-81dc10",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-bcd487",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
