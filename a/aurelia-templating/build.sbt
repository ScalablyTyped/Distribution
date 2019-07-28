organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-2aab71"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-cef979",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-f3ad25",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-a5c632",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-149de0",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-ad5c77",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        