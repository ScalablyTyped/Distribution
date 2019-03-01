organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.0.7-dd6d35"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-308b7e",
  "org.scalablytyped" %%% "apollo-env" % "0.3.3-8efec2",
  "org.scalablytyped" %%% "apollo-graphql" % "0.1.1-759eb5",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-e0a311",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.3-e25add",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-a574cf",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-76463f",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "graphql-extensions" % "0.5.4-f4f55c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190212Z-d37718",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-9f7187",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-1e1851",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-0a9f1a",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-11ba80",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-194d25",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-fcd7c0",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-5309c0",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-22d711",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-b6fcaa",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-dcfcdb",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7a72e9",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-a1c1c6",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-a2b675",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-31fee9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        