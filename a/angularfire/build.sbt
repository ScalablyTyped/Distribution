organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181124Z-b4adf7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-6e38d5",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8101a4",
  "org.scalablytyped" %%% "firebase" % "5.8.1-1bc5e2",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-e62e9f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-c894b1",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.2-c6dfd9",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.1-f1ac1f",
  "org.scalablytyped" %%% "firebase__database" % "0.3.11-fad15b",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.4-22142a",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.1-d2f6b7",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.1-4d8a32",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.6-259fe8",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.2-43cf9a",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.5-1b0e66",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.10-8430a8",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.4-93fb51",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.5-b1c7a4",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.7-9e533a",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.4-5bb8b4",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-940c18",
  "org.scalablytyped" %%% "grpc" % "1.17.0-845764",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-b3a807",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-e12b56",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-595256",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-99178b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-1d9f0d",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e01f75",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-14f98a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-3c3a8c",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-3e5519",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-c6fcbc",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b178af",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9e97a1",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-922b9f",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-87da94",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-9eee98",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-2cdf20",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        