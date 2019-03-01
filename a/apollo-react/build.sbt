organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-dd4e5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-244c1b",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-486e74",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-778406",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-cca711",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-e0abb3",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c5ec1",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-8d749f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190212Z-c48592",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190212Z-e98b5d",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190212Z-508843",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190212Z-aa72c4",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-db9b79",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "redux" % "4.0.1-c1f77c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-9c7de5",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-622cd4",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5c7895",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-197aae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        