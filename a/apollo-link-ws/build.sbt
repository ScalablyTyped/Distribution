organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.17-075b39"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-1d20bf",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-081994",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-a67bc6",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-e50f15",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-855b6c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7ac41d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        