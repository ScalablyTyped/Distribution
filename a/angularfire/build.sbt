organization := "com.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20180910Z-7f7249"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-dc4282",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2f50f6",
  "com.scalablytyped" %%% "firebase" % "5.5.9-b31ed1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.5-25ed14",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-14e11f",
  "com.scalablytyped" %%% "firebase__auth" % "0.7.9-2eab35",
  "com.scalablytyped" %%% "firebase__auth-types" % "0.3.4-5b5685",
  "com.scalablytyped" %%% "firebase__database" % "0.3.7-51fdf2",
  "com.scalablytyped" %%% "firebase__database-types" % "0.3.2-c61ea5",
  "com.scalablytyped" %%% "firebase__firestore" % "0.8.8-2ac6fe",
  "com.scalablytyped" %%% "firebase__firestore-types" % "0.7.0-62f838",
  "com.scalablytyped" %%% "firebase__functions" % "0.3.3-6b3d4f",
  "com.scalablytyped" %%% "firebase__functions-types" % "0.2.1-81fdd3",
  "com.scalablytyped" %%% "firebase__logger" % "0.1.2-c43810",
  "com.scalablytyped" %%% "firebase__messaging" % "0.3.7-ac0001",
  "com.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-62fda4",
  "com.scalablytyped" %%% "firebase__polyfill" % "0.3.3-d5e8d5",
  "com.scalablytyped" %%% "firebase__storage" % "0.2.4-9f3ad9",
  "com.scalablytyped" %%% "firebase__storage-types" % "0.2.3-dac898",
  "com.scalablytyped" %%% "firebase__util" % "0.2.3-129b5c",
  "com.scalablytyped" %%% "grpc" % "1.16.1-638629",
  "com.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-890fdf",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-cac3f5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-f29828",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-183195",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-f1a9b6",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-b9574f",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bc632a",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-f0b1ba",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-7e30cc",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-e23db2",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-dd54d5",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-e3ab94",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-26d6db",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-778e95",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        