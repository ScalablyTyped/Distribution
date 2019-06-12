organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.6.3-5c275f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.5.0-f51c6c",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.3.1-19e8af",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-6ec230",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-d56c94",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-0979b9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-3db4d7",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-e27446",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.5.2-b4cb41",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-8ed1cf",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-f9a28a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-05bf94",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-1af13e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-335742",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-01bc11",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-be1f4f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-cb6c46",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4da704")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        