organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181206Z-01d992"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-b4446a",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2f8c45",
  "org.scalablytyped" %%% "firebase" % "5.7.0-6980a0",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-8fd839",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-16fd78",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.0-43ff3f",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-415ad8",
  "org.scalablytyped" %%% "firebase__database" % "0.3.7-450ccc",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-259782",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.0-4ed8fb",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-8a1b79",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-37a74b",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-f656c9",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-c4393c",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-f7c595",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-1d536c",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-977729",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-843d14",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-ce2d19",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-e3b965",
  "org.scalablytyped" %%% "grpc" % "1.16.1-eae5ff",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-fcf52e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-3aa15f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-e0c5f6",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-f98d31",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-cf39e8",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d7cd87",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a2281d",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-eacc8a",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-9682d2",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-1d2334",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-fec06d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-e6bd96",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c28576",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21ec1b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        