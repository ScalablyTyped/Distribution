organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-0796fb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-eb52ae",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-04d977",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ae2a8e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-382e29",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-9e4cb7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-569cc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        