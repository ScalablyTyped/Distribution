organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-28639d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aa671f",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-9ad653",
  "org.scalablytyped" %%% "graphql" % "14.6.0-800d77",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-b44279",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-69f918",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-17d6b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
