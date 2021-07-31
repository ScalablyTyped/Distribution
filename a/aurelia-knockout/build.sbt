organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.0-40dc4a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-81bc26",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-48a957",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-ceb9ef",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-924eb6",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-d85ae8",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.4-ee3b03",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
