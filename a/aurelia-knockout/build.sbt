organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-b902d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-cbe03b",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-109b87",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-ec52e8",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-5a1bc7",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-b1f82a",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-ef1cb7",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        