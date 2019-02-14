organization := "org.scalablytyped"
name := "apollo-client"
version := "2.4.13-874409"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.26-976c7b",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-9b747f",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-55234c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.3-f99fa2",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-467272",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-6cdd80",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-0ed4ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        