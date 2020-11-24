organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.0-181d43"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-04efc1",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-a46ff0",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-ee46d9",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-c9319d",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-b16ec9",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.4-c49554",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
