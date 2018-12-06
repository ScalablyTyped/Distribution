organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.10-8db292"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-f5ddbe",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-181e22",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-f0cc66",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-309cca",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-f94ee7",
  "org.scalablytyped" %%% "iterall" % "1.2.2-5ff71a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-15f3aa",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-85e500",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-cf13fe",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-203351")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        