organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.17-00fe0b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-4cdbff",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-a54109",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-46ed8a",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-b9803f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-bda8a6",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-bbb22f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        