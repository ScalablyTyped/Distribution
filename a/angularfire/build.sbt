organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181206Z-1e1769"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-9a8364",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-3acce5",
  "org.scalablytyped" %%% "firebase" % "5.7.0-82a33b",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-00c7c1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-bdd51e",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.0-bd502c",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-abf1f8",
  "org.scalablytyped" %%% "firebase__database" % "0.3.7-b36f13",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-1ac179",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.0-cd3168",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-b4d463",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-8012b4",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-adb1e8",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-9dd3b5",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-78e7d3",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-6597fc",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-327072",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-c5d124",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-d22fab",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-18bc12",
  "org.scalablytyped" %%% "grpc" % "1.16.1-ab6594",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-467ac7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-153ce0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-8397c9",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e136ca",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-d3e3b2",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d9ae65",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-d4193a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-907098",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-407e0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bc95c4",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-cf41d5",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-632fdf",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ccad89",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-51b4ae",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        