organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-f53eda"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-4d60e6",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2451ee",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-c8bed5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        