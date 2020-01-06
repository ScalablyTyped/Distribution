organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-4e71dc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-a7a589",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-ca0a37",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-dd7598",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-b01a01",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-106ed5",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-364ade",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        