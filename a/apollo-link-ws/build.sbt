organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-53999d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-d0a417",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-da1e84",
  "org.scalablytyped" %%% "graphql" % "14.6.0-d18599",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-64c2a7",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-deeaca",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-c6e790")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
