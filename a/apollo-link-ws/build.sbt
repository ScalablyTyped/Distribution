organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.10-693d86"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-5ebd88",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-7c4334",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-57f2af",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-1206f1",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "iterall" % "1.2.2-0da489",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-a8e3be",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-ba9141",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-6efe62",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-b2ad40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        