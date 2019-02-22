organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181124Z-95c079"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-f970f0",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-94697d",
  "org.scalablytyped" %%% "firebase" % "5.8.4-3c8ff4",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-549c81",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-7c079d",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.3-51726d",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.2-63b267",
  "org.scalablytyped" %%% "firebase__database" % "0.3.12-169fe2",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.5-c71257",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.4-a501dc",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.2-45df06",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.7-e3761c",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-1c156e",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.6-1275ac",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.11-fe3581",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-aaaf15",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.6-f9238d",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.8-073295",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.5-db9127",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-051cad",
  "org.scalablytyped" %%% "grpc" % "1.18.0-7d1388",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-292775",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-30ec73",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-0296d2",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-02eb4a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190212Z-ed7143",
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
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        