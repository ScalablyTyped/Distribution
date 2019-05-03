organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.4.8-3debbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.3.1-58cab9",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.0.7-916d67",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-eca28b",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3e2f2b",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-5ded50",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-73e025",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.1-59775e",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.3.7-9d1840",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.5-e0ef02",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-c8407a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-34d51a",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-18143d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-33488f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-88d574",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-980bd6",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        