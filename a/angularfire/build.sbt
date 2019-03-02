organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181124Z-54503e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-7e4f8a",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-437b18",
  "org.scalablytyped" %%% "firebase" % "5.8.5-abece2",
  "org.scalablytyped" %%% "firebase__app" % "0.3.10-2d17c8",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-040f4f",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.4-9db7df",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.3-dea7c6",
  "org.scalablytyped" %%% "firebase__database" % "0.3.13-edb3fd",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.6-ae8bf2",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.5-75248a",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.3-572dc3",
  "org.scalablytyped" %%% "firebase__functions" % "0.4.0-12a7be",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.0-a63e55",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.7-d883ae",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.12-345443",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.6-02b277",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.7-2eaa47",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.9-5cf6dd",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.6-370b2a",
  "org.scalablytyped" %%% "firebase__util" % "0.2.8-9a6cc6",
  "org.scalablytyped" %%% "grpc" % "1.18.0-5de3d4",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-06f74b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-230f3e",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-4af46b",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-9f7187",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190212Z-964263",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-439a87",
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
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        