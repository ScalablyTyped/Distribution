organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.7-a68517"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-704b78",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-8a43ca",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-2fbd77",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-b39b9e",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-b49b3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-d1718e",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.7-d20d3d",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-9e8874",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-984ae3",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-eb26bb",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-9e1101",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-11a727",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-9f943f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-6b1423",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-5c770f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-3e9383",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-52c9ae",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-dd73fa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-64180e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-8fd375",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-2a689c",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-524609",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-a6254d",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-93dc69",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-f8b4a9",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-d12bfa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b8febd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-827e1a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-dcaabf",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-8f6b1c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        