organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.0.7-2f007f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-10a5d1",
  "org.scalablytyped" %%% "apollo-graphql" % "0.1.2-2a6c57",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-7e6584",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-264097",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-5b20dd",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-d4ffb6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-9a6119",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-3e33b7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-a03f5d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-86ab76",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-86ed03",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-04aaa9",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a2cc95",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-4b38c0",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f020d2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-ae7ee1",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-f0cb50",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-225760",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-121af0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        