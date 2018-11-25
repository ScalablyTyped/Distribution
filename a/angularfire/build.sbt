organization := "com.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20180910Z-0d99b3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-d10678",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-c4dd38",
  "com.scalablytyped" %%% "firebase" % "5.5.5-f0295d",
  "com.scalablytyped" %%% "firebase__app" % "0.3.4-1508e1",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-254ba4",
  "com.scalablytyped" %%% "firebase__auth" % "0.7.8-fd41a2",
  "com.scalablytyped" %%% "firebase__auth-types" % "0.3.4-299bb4",
  "com.scalablytyped" %%% "firebase__database" % "0.3.6-d7b34c",
  "com.scalablytyped" %%% "firebase__database-types" % "0.3.2-039e85",
  "com.scalablytyped" %%% "firebase__firestore" % "0.8.5-3749f9",
  "com.scalablytyped" %%% "firebase__firestore-types" % "0.7.0-05dbbc",
  "com.scalablytyped" %%% "firebase__functions" % "0.3.1-2d13bb",
  "com.scalablytyped" %%% "firebase__functions-types" % "0.2.0-18995b",
  "com.scalablytyped" %%% "firebase__logger" % "0.1.1-a73797",
  "com.scalablytyped" %%% "firebase__messaging" % "0.3.6-fddf90",
  "com.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-a4bf87",
  "com.scalablytyped" %%% "firebase__polyfill" % "0.3.3-029d0a",
  "com.scalablytyped" %%% "firebase__storage" % "0.2.3-c397a2",
  "com.scalablytyped" %%% "firebase__storage-types" % "0.2.3-4d2958",
  "com.scalablytyped" %%% "firebase__util" % "0.2.2-45bc2d",
  "com.scalablytyped" %%% "grpc" % "1.15.1-f61946",
  "com.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-5fbdce",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-ace41c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-de8977",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-6842ae",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-2c7cd8",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2c8f62",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63e3a1",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-03b0c2",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-2abc1b",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-960bf5",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-e8e70d",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-c48b13",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-2fb531",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-0af194",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        