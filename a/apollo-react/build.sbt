organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-8d3077"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-9d6ea7",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-16121e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-efbf25",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-ba8e89",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-9a220d",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-0934bb",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-b88ad1",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-8159b9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180723Z-17d26c",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-b40066",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-1e255c",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180723Z-0320f2",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-09b30c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "redux" % "4.0.1-f0c24b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-0b86c7",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-c7be7f",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-e939a5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-bcca04")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        