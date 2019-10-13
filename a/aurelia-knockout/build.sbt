organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-f06f08"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-3440e2",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-ee45d9",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-eb4151",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-f43bcc",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-51e3f9",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-9d55b3",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        