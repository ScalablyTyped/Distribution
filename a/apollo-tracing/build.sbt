organization := "com.scalablytyped"
name := "apollo-tracing"
version := "0.3.3-c9f05a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-env" % "0.2.5-ad297d",
  "com.scalablytyped" %%% "apollo-server-env" % "2.2.0-934797",
  "com.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.8-9e0b42",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-afbfd8",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "graphql-extensions" % "0.3.3-c44bd4",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-0916c6",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-8a2876",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        