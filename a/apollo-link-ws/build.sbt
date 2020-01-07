organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-953ee7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-092388",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-29b1be",
  "org.scalablytyped" %%% "graphql" % "14.5.8-216385",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-d612b0",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-c8cf2b",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-f75794")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        