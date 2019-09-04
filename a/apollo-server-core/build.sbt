organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.3-23bfef"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-f3acdc",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-232004",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9400c3",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-42c83e",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-4d60e6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-cf1ece",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-f0e4b4",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-dc3269",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-fa1f51",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-bee03d",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-73113c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-df943a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a5b07",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4940ec",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2563ef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-c41353",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-6b58bd",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-0b938e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-3eda9d",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-54bd4e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-0d114c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-7db036",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2451ee",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-c8bed5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        