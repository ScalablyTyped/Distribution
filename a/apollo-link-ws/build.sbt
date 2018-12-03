organization := "com.scalablytyped"
name := "apollo-link-ws"
version := "1.0.10-379e12"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.4-cf91b1",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.26-9dddf4",
  "com.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-c6e5da",
  "com.scalablytyped" %%% "eventemitter3" % "3.1.0-88be71",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "iterall" % "1.2.2-e9ddad",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-0fb9ca",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-fd1ae5",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-854602",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.11-bacf6e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        