organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.0-4a4b12"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.2-d8a27b",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-93e2a9",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-954ef8",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-a58239",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-641b93",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.3-2d0801",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
