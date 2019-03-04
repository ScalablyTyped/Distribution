organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.14-8f37b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-98b0c6",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-cceb10",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-f24df8",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4cc51c",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-33a95e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d82b7c",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-ca96a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        