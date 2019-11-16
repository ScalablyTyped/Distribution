organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.9-0a21ee"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7111b5",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-35eee9",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9225ef",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-ab132c",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-32ae6a",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.9-2e50f0",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-819dc7",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-4da521",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-993493",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-e1daeb",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-77b279",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-25484c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a86019",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-337a2e",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-c6bcf5",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-d374cd",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-ce8d0e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-f0de5e",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-ba0553",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-32e593",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-d66bf2",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-a91b24",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-bab225",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-322605",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-af407f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ac1781",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-739503",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-8e2bd2",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        