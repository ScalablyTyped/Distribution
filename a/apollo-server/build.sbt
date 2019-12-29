organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.15-05139b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-894834",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.10-a3ed5e",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.4-31f2c0",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.13-1b5323",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-aeac1e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-2b791a",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-cb1394",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.15-aa6252",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-35b7f0",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-7a7b85",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.15-70e6d9",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.10-3eb961",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-f38334",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-315224",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.2-0caad7",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-50785c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-a6e038",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-1c3030",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-1e33b0",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-f9a611",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.9-28a1fd",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-dbf2c5",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-057b48",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-e30a72",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-647d39",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-76fdef",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-377e28",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-bf7abc",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-c264c7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-6da803")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        