organization := "org.scalablytyped"
name := "apollo-client"
version := "2.4.12-c9dc54"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.25-68cd05",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-cc52df",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-314922",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-66344e",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-5c65a8",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-0cbed1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-29c689")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        