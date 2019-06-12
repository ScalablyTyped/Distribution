organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-5a2b31"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-b8d3fb",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-556e97",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-3ce28f",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-1ed819",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-20169a",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        