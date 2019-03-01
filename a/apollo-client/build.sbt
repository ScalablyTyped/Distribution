organization := "org.scalablytyped"
name := "apollo-client"
version := "2.5.1-486e74"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-244c1b",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-778406",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-cca711",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-e0abb3",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-9c7de5",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5c7895",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-197aae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        