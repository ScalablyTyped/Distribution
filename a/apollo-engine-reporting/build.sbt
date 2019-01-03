organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "0.2.0-817814"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-cae812",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-68d1c1",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-1019d7",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-54489a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-c30cf6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3aadd3",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-770897",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c931e6",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-5e843a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-30774a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-592e97",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-e194a5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9d3553",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1d4f93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-35f35b",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-eddee7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-946a5f",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-2df8c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        