organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.14-f5e71f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-9b747f",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-b1f74a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-72b90f",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-467272",
  "org.scalablytyped" %%% "iterall" % "1.2.2-cf22a7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-0db6a3",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-87367a",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-6cdd80",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-0ed4ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        