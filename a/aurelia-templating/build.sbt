organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-e72f7f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-45fdbc",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-6785f7",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-3b34d8",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-3a9d95",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-9d0ce4",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        