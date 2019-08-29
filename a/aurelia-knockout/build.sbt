organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-92bb87"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-d6e311",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-eb9430",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-5bebc9",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-1e8182",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-02e8ee",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-dd938a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        