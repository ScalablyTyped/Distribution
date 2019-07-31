organization := "org.scalablytyped"
name := "apollo-server"
version := "2.8.1-7952dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c9d11e",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-9a64a7",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-edceaf",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.3-a118b7",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-c6f06d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-16bcb2",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a37b56",
  "org.scalablytyped" %%% "apollo-server-core" % "2.8.1-c8059e",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-bec46d",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-e7b445",
  "org.scalablytyped" %%% "apollo-server-express" % "2.8.1-315f61",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-4b8a57",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-aa7dde",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-50eec6",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-f16695",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81b6cc",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-65363d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-455870",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-b59b68",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-f2f8bb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-8a448f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-d99a71",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.1-dc1a8c",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-cedc3a",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-7862ab",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190513Z-393883",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-1edcf0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4c5b4d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-f9da0b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-fb60a8",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-c317b3",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-871dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        