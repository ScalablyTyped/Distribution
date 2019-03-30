organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.17-b97d1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-0d8242",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-5d92c5",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-d72019",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-3c8488",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-d9f4a2",
  "org.scalablytyped" %%% "iterall" % "1.2.2-f97d72",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-c8a52e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-e57298",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-e0e064",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-c37980",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-abdcc5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        