organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.7.0-3d3fda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.0-9f0691",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.0-f3917c",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.0-53d036",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-55aef3",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-5b52c0",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-edaa6b",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-657021",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-e1bd83",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.0-2153e7",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.0-495ce2",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-a249aa",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-d508f0",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-25ddc7",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-c591ae",
  "org.scalablytyped" %%% "graphql-extensions" % "0.8.0-2a5187",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-9a9fa6",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-46fd4d",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-e7cb01",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-98705f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-974c80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        