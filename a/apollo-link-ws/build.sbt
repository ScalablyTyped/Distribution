organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-da8289"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-a26a1b",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-292039",
  "org.scalablytyped" %%% "graphql" % "14.6.0-2fa9e2",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-6210ce",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-19ac01",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-118859")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
