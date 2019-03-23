organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20190322Z-f87684"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-5e6318",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-ddf594",
  "org.scalablytyped" %%% "firebase" % "5.9.1-d569f6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.13-cc9702",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.7-04850d",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.6-d8b6f2",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.5-65d247",
  "org.scalablytyped" %%% "firebase__database" % "0.3.16-098f1d",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.8-6fd283",
  "org.scalablytyped" %%% "firebase__firestore" % "1.1.1-c3033b",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.1.1-e2791b",
  "org.scalablytyped" %%% "firebase__functions" % "0.4.3-e67949",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.2-2d3e48",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.10-3db2dc",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.15-8208a7",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.8-929eb4",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.9-657301",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.12-cbc803",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.8-1355e7",
  "org.scalablytyped" %%% "firebase__util" % "0.2.11-546759",
  "org.scalablytyped" %%% "grpc" % "1.19.0-6bbd1d",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-2550bc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-e15c6b",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-4fd6b5",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-b30bce",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190312Z-835320",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-6de75f",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-6d28c3",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-46201f",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63857b",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-fe2693",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c2c6bd",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-3b892b",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-97bb93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-8051ed",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-7152e5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1df087",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        