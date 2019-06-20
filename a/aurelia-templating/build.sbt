organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-9d16f6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-b1907c",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-63b415",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-70218e",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-8ce45f",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-beb416",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        