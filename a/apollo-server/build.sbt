organization := "org.scalablytyped"
name := "apollo-server"
version := "2.15.1-5d670b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-7f6a30",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.11.1-e40d41",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.2-2f48b9",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "2.2.1-70e9b9",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.5.2-7bf1ab",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-6f7d74",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.2-a2f0fe",
  "org.scalablytyped" %%% "apollo-server-core" % "2.15.1-0bc9c5",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.5-c3ff1e",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.4.2-720589",
  "org.scalablytyped" %%% "apollo-server-express" % "2.15.1-413c40",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.9.1-d5814d",
  "org.scalablytyped" %%% "apollo-server-types" % "0.5.1-667871",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.4-f72edf",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.8-fb0e2f",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.26-7b2bf7",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-bcd10f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-9875f5",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20200515Z-c04486",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-81dd80",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-8c1d89",
  "org.scalablytyped" %%% "graphql" % "14.6.0-578a82",
  "org.scalablytyped" %%% "graphql-extensions" % "0.12.4-ee289a",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-134650",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.8-fed09b",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-b96b93",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-723b36",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-a09b4e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200515Z-104b3d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7b3798",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c5e2e8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9b0303",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2b0df4",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-e2bf41",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-71140e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
