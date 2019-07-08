organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.6.7-a8dbfc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.5.0-cf6876",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.3.5-bcc129",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-ab2ce2",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-6a27f8",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-edaa6b",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-044d5c",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-e1bd83",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.5.6-96e287",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-a249aa",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-e57046",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-2b0ec8",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-c591ae",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-24efda",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-46fd4d",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-4ae753",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-4f05bb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-974c80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        