organization := "com.scalablytyped"
name := "apollo-link-ws"
version := "1.0.8-0e76e7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-373593",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.25-13c381",
  "com.scalablytyped" %%% "backo2" % "1.0-dt-20181102Z-3df5eb",
  "com.scalablytyped" %%% "eventemitter3" % "3.1.0-f457d9",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181102Z-c82035",
  "com.scalablytyped" %%% "iterall" % "1.2.2-74db06",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20181102Z-47a6d5",
  "com.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20181102Z-413d4e",
  "com.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20181102Z-17ab54",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.8-ff997a",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20181102Z-6a247d",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20181102Z-e5f69d",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-c8cd90",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        