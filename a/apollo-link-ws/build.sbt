organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.18-23e8bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-644548",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-ef4b6c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-f0ece1",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2e8905",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-a66a28",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        