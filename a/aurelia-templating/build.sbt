organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-ca5b6d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-7a3d65",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-0446bf",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-1b21a8",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-e7c33e",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-a8d033",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        