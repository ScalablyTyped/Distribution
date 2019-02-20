organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.0.2-146885"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-b2e271",
  "org.scalablytyped" %%% "apollo-graphql" % "0.1.1-1ca49f",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-273462",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-028562",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-467272",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190212Z-7840cb",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-02eb4a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-ae8c41",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-16ebb5",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-e26d13",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-6367f2",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a9473",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ee2249",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b87ef3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0df27",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f2eb3d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cc4d0",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-22c235",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-9c4942",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-10c485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        