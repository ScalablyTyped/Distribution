organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.18-bd1071"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-f86490",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-32acc9",
  "org.scalablytyped" %%% "graphql" % "14.5.3-be513a",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-08b8ea",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a1e22f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-002886")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        