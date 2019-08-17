organization := "org.scalablytyped"
name := "aurelia-templating"
version := "1.10.2-528057"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-2c2d5a",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-713ab3",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-33a0bc",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-c3d646",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-4f577e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        