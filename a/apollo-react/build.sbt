organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-56b557"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-dbcd15",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-91b368",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-f30531",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.18-c47fa8",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-add0e3",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-d9f4a2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-444aa6",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-4a316b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190214Z-26b07c",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-6b1c7f",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-aa14b5",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-e100a4",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20190322Z-d95386",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "redux" % "4.0.1-caedab",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-4a4f36",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-41be70",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-c37980",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-abdcc5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        