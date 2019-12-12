organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-556e11"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-6b3e58",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-0d68c0",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-85b360",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-8f84c0",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-5a96f1",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-af0c57",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        