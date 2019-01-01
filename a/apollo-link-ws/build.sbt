organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.12-9514b9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-b691e2",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-8fb33a",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-5aca12",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-f1fa89",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-54489a",
  "org.scalablytyped" %%% "iterall" % "1.2.2-1d5c18",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-a40092",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5fcabc",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-9c6819",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-80038a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        