organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.10-6249b2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-835191",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-7c4334",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-57f2af",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-1206f1",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "iterall" % "1.2.2-0da489",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-061c85",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-7a5584",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-6efe62",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-b2ad40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        