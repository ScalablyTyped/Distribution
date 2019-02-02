organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.14-128c72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-cc52df",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-66344e",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-7e0647",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-3e97b7",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-5c65a8",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4373bf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-ec939c",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-43e6d0",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-0cbed1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-29c689")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        