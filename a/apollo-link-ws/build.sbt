organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-7e9827"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.14-246d1b",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-b346ef",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.17-1c239a",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-0157fd",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.21-e83db8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
