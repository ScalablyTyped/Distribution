organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-ce68df"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-dc31c9",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-858c2f",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-6a02ea",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-6ae0a8",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-e8b5b4",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-eb0020",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        