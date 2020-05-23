organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.3-a675d6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.2-8a9623",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-30192a",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-95e6c8",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-bfd907",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-b3f80d",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
