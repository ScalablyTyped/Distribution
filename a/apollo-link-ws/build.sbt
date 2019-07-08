organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.18-1307ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-6a27f8",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-2b0ec8",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-c591ae",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-4ae753",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-4f05bb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-974c80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        