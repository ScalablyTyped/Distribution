organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.13-6edcc2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-02d463",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.8-6b032f",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-280073",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.11-d54f62",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-b83394",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-3e9d24",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-11e239",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-3121d8",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-c192e8",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.8-b4a329",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.8-751ea0",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-6007d5",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.2-6a1cf2",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-506fa5",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-dbbefd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b2c6f4",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-82124d",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-74902e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-7b0398",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-051e33",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-5f6e71",
  "org.scalablytyped" %%% "graphql" % "14.5.8-92eff2",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.7-0356d5",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-addc65",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-a31f88",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-456106",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-ae878f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f2210d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-dafec3",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-3445a5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        