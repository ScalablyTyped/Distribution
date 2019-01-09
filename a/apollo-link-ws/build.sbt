organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.12-e397f6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-efbf25",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-9a220d",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-4d5067",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-1fafa7",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-0934bb",
  "org.scalablytyped" %%% "iterall" % "1.2.2-bc2d56",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-cf4a74",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-0b86c7",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-ee4fde",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-e939a5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-bcca04")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        