organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-27715c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-d3b7b4",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-cda4b4",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-8355e3",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-53407d",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-31e4d1",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-028854",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        