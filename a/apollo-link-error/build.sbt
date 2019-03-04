organization := "org.scalablytyped"
name := "apollo-link-error"
version := "1.1.7-da1b12"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-98b0c6",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.10-fde15b",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-ca96a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        