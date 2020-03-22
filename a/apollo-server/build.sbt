organization := "org.scalablytyped"
name := "apollo-server"
version := "2.10.1-5f14ca"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6c56fa",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.11-2b682d",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.0-704585",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.6.0-9c91d3",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-85f674",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-824d3c",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-8cb469",
  "org.scalablytyped" %%% "apollo-server-core" % "2.10.1-dc8310",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-d74f6e",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-e03e8b",
  "org.scalablytyped" %%% "apollo-server-express" % "2.10.1-660b31",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.10-9d97f1",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-bc2c73",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-934211",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.3-b80783",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-90a457",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-c42858",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-55299d",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-219c93",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-641541",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-be955f",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.10-2cddc0",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-bd8987",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.7-bc19a6",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-673b5f",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-c8bdc7",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200211Z-a5bb51",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200122Z-abc547",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-ca726f",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-9e5eae",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
