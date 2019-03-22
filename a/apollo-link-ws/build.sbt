organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.17-7f213d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-e13a57",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-da0a30",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-a8dbaf",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-3d3736",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-aa9287",
  "org.scalablytyped" %%% "iterall" % "1.2.2-e4101d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-b7cad7",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-6c21c8",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-8629d7",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-4a9f67",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-3d5d0d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        