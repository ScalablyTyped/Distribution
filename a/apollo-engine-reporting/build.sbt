organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.0.7-d57297"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-2c0f8d",
  "org.scalablytyped" %%% "apollo-env" % "0.4.0-252d61",
  "org.scalablytyped" %%% "apollo-graphql" % "0.1.3-f47951",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-c1f5de",
  "org.scalablytyped" %%% "async-retry" % "1.3-dt-20190331Z-721ee5",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-0940d0",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-d9f4a2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-273079",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-418504",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-2db1bb",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-656775",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-7d3a63",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e9c001",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-7658b2",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-d98038",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-04dd70",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-115d28",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1fe064",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-aa4a7f",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-87cd30",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-3bda91",
  "org.scalablytyped" %%% "sha_dot_js" % "2.4-dt-20181126Z-74a4b7",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-eebb35")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        