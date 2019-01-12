organization := "org.scalablytyped"
name := "apollo-link"
version := "1.2.6-cd9314"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-a360c0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-d3e2e1",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-1f070e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-3a10ce")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        