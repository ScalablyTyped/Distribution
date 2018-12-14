organization := "org.scalablytyped"
name := "apollo-tracing"
version := "0.4.0-d3cbdb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-55fad4",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-3df38f",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-5e2328",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-102207",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "graphql-extensions" % "0.4.0-c5ca45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-055952",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-1eb4cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        