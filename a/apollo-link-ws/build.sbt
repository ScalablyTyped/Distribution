organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-77132e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-2b791a",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-1e33b0",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-bf7abc",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-c264c7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-6da803")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        