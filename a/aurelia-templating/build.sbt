organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.11.1-4514b3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-1408ac",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-418457",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-db3b30",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-94cbec",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-75eb0f",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
