organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "0.2.0-011ab2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-65cd79",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-1747bc",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-d0a31c",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-0934bb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-ca8e22",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3967d2",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-623ff0",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c9cd0e",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-4d395a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-393c71",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-75a7a1",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a7a2c3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-87f989",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-449d21",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-747022",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-32e1b5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c56e65",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-e6e47c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        