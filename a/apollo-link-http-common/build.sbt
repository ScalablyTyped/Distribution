organization := "org.scalablytyped"
name := "apollo-link-http-common"
version := "0.2.8-401f0a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-b691e2",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-8fb33a",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-54489a",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-9c6819",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-80038a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        