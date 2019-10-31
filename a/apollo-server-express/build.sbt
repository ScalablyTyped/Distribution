organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.7-28443a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7b6f78",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-99c021",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-2fbd77",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-810100",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-b49b3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-d1718e",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.7-c203b7",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-55d365",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-984ae3",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-91b124",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-34b581",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-11a727",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-9f943f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-912347",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-183255",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-447551",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-0b325c",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-22646c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-900bce",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-04f31e",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-83ef40",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-48a269",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-94817e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-0f879c",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-fb342d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-686200",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b8febd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6a27ff",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-653e10",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-b725c4",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        