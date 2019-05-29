organization := "org.scalablytyped"
name := "apollo-cache-control"
version := "0.6.0-c28113"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.4.0-e32eba",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.1.0-f3362f",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.0-65992a",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-527c94",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-c19ff0",
  "org.scalablytyped" %%% "apollo-server-core" % "2.5.0-bf0672",
  "org.scalablytyped" %%% "apollo-server-env" % "2.3.0-4abe03",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-892477",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.4.0-2d78d2",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-76a8f1",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.18-16df43",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-93f011",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3e2174",
  "org.scalablytyped" %%% "graphql-extensions" % "0.6.0-70cc0e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-4472f3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2b8fd3",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-440471",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-41362f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-508485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        