organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-56fac6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-401eee",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-1024c6",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-a440ec",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-b0de7e",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-f44ef9",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        