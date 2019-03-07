organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-054424"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-d0ddff",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-09bddf",
  "org.scalablytyped" %%% "apollo-link" % "1.2.9-141f49",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.16-9076e1",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-4444e9",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-421c03",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-ecc25b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190214Z-a347bf",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-c84b8f",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-eb2fa0",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-f3e21b",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-cda594",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-ca9939",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-aefcef",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.16-b7d126")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        