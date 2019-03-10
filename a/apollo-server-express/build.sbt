organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.4.8-f8100d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-452196",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.5.2-fb9644",
  "org.scalablytyped" %%% "apollo-datasource" % "0.3.1-0e3970",
  "org.scalablytyped" %%% "apollo-env" % "0.3.4-40a488",
  "org.scalablytyped" %%% "apollo-link" % "1.2.9-141f49",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-b64c43",
  "org.scalablytyped" %%% "apollo-server-core" % "2.4.8-469fc6",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-c5553d",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.1-9f2b73",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.3.7-34ee11",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-4444e9",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.4-4cf853",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-608940",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-cceb10",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c60c6c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a449b6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-e810cb",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-a09722",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-bae2c8",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-f24df8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-48f106",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-deeb53",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "graphql-extensions" % "0.5.4-84c0fe",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-2f7633",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.1-7ea4b3",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-ee27de",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4cc51c",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-78bbd1",
  "org.scalablytyped" %%% "sha_dot_js" % "2.4-dt-20181126Z-75b171",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-981d4d",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-ca9939",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "type-is" % "1.6-dt-20180214Z-f965fd",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-121af0",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-49c2de",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-258a45",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.16-b7d126")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        