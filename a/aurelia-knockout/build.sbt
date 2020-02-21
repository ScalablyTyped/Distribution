organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-aa0ff7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-978a8a",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-6adcc6",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-b174cb",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-2265c5",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-64768f",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-b95e7a",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
