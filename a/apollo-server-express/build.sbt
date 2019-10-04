organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.4-23a430"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-4395cb",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-1dd9ab",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9400c3",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-b6d10a",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-5a2b8f",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.4-2555d9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-b3cd92",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-5f8665",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-a3bf77",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-a79f15",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-717faf",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-73113c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-4a01ec",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4ebaba",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-fcc262",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-b9f458",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-c5a083",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-7372e6",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-dcf68c",
  "org.scalablytyped" %%% "graphql" % "14.5.8-1773a0",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-9e1f3f",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-bb2292",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-1ee45b",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-ef480a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-5aac4e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c08138",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-9e0e03",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-46b3ba",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-62290b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        