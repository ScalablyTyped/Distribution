organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.18-254a78"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-d56c94",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-05bf94",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-1af13e",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-be1f4f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-cb6c46",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4da704")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        