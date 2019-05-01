organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-0f03a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.0-f4c684",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-9ca40a",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-833fe6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-ae5d68",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-bf8e28",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-250aaf",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        