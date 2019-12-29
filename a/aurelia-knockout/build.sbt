organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-fa39c7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-c576df",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-53baac",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-d7d933",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-442c4e",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-aa63ee",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-279168",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        