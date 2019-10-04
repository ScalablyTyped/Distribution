organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-1f397c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-5a2b8f",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "graphql" % "14.5.8-1773a0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-9e0e03",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-46b3ba",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-62290b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        