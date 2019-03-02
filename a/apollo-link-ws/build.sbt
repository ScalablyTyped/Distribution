organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.14-fa73de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-778406",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-a9ba27",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-43aebf",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "iterall" % "1.2.2-94834f",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-c4299b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b50e41",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5c7895",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-197aae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        