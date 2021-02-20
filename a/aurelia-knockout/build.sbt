organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.4.0-427fcb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.4-738a07",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.2-531067",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-e4a50c",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.7-0d5a43",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-dec168",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.4-608420",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
