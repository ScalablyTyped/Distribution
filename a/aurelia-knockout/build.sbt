organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.0-4a7a0e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-ba3224",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-6e594d",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-9c6aaf",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-55a6ef",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-430068",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.4-f2cca0",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
