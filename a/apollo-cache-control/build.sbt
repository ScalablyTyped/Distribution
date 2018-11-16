organization := "com.scalablytyped"
name := "apollo-cache-control"
version := "0.2.5-4009d8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-server-env" % "2.0.3-6c8a83",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181102Z-c82035",
  "com.scalablytyped" %%% "graphql-extensions" % "0.2.1-04978f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181116Z-b7ed5a",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20181102Z-4b357b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        