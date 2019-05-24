organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-85b733"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-178daa",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-98898e",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-d6560e",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-549e2a",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-6cc41e",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-c998bd",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        