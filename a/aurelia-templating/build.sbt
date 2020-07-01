organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.3-5b2421"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.2-a4333c",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-3b6204",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-7f6831",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-bdc84d",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-bb4f74",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
