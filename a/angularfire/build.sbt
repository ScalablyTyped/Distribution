organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181206Z-16f641"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-beeb4f",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-41c841",
  "org.scalablytyped" %%% "firebase" % "5.7.0-995009",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-cb525f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-2f786b",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.0-c8f635",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-8fc773",
  "org.scalablytyped" %%% "firebase__database" % "0.3.7-735a7a",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-734fd1",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.0-ab61fd",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-465207",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-ec4e0c",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-7f689d",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-fe161f",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-bdea24",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-3910bd",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-32ecb8",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-282e54",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-e27e61",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-f6e00f",
  "org.scalablytyped" %%% "grpc" % "1.16.1-7af532",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-70f06b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-387ddd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-bb1273",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-89b4f7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-27957d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8b222a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bd1923",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ce83b4",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c51d9d",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-22a8a7",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-53afa0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b14493",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6efed3",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-045d53",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        