organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.15-345cac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.9-141f49",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-4444e9",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-cceb10",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-f24df8",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4cc51c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-981d4d",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-ca9939",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-258a45",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.16-b7d126")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        