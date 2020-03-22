organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.3-c921c7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.2-ae6687",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-8a15ee",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-02c6e4",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-be95ef",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-88c9fb",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
