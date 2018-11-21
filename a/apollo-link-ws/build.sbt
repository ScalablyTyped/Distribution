organization := "com.scalablytyped"
name := "apollo-link-ws"
version := "1.0.8-528ead"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-ed789a",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.21-6af781",
  "com.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-907b56",
  "com.scalablytyped" %%% "eventemitter3" % "3.1.0-445710",
  "com.scalablytyped" %%% "fclone" % "1.0.11-4304d4",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-4871a9",
  "com.scalablytyped" %%% "iterall" % "1.2.2-770ade",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20180910Z-972791",
  "com.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-eb876c",
  "com.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-d0342e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.8-5b7f55",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-aa3847",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-2ae465",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-36203d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        