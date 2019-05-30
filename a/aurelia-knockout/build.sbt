organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-738034"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-220a28",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-f5c37b",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-cc2a5a",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-1a3655",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-38bce4",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-87a9c8",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        