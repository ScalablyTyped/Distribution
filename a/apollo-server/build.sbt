organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.3-fd0bd7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7abcc9",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-ccaeec",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9400c3",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-06f4ed",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-74f376",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.3-2ace5b",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-3c8fde",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-496183",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.3-44bb22",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-970c0c",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-35be14",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-3828ec",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-73113c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8ff114",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-090bd5",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190916Z-980c44",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-8948ae",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-915bef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-48acfb",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-9ca789",
  "org.scalablytyped" %%% "graphql" % "14.5.6-6d234a",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-7b7946",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-b7220c",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-8a5d93",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-5343e4",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-ac5534",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4181d6",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-bffbf8",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a3a190",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        