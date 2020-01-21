organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-27c0c4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-c36848",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-42b39e",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ac6a9e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2a7565",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200115Z-c1344d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-610cde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        