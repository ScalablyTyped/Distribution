organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-39b3f7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.5.0-2e7ff6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.5.1-c5f57b",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-5bebc9",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-1e8182",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-02e8ee",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        