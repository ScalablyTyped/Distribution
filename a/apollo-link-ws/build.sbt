organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.10-d5c63a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-b0ec7c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-062b35",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-57b385",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-0150b5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4bf127",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-bafefb",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-bb7698",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-962402",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-76cd5d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        