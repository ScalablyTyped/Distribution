organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-73017e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-824d3c",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-ca726f",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-9e5eae",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
