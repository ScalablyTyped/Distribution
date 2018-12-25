organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181124Z-871ad6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-a51b52",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-96442c",
  "org.scalablytyped" %%% "firebase" % "5.7.1-4cb4d6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-35017a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-a29f03",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.1-5f63da",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-ac0ae6",
  "org.scalablytyped" %%% "firebase__database" % "0.3.8-a0c37e",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-0a1249",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.1-13a87c",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-563c5b",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-7c4b24",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-928709",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-b0e383",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-6d670b",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-45d355",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-ef98b2",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-aa7e68",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-07650b",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-fe24e7",
  "org.scalablytyped" %%% "grpc" % "1.17.0-20f5b7",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-3fbe3d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-8e6897",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-dd6e2e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-a0b1b2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-023dae",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-8af596",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-eb4ed7",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8265ef",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a9eb67",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-b99416",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c7db0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-29d2d9",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-db95a2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-65a6ba",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-4b21fc",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21d69c",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        