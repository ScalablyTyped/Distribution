organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-86f8a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.26-976c7b",
  "org.scalablytyped" %%% "apollo-client" % "2.4.13-874409",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-9b747f",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-55234c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.3-f99fa2",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-467272",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-dbe640",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-d5355c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190212Z-1d005d",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190212Z-613e1b",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190212Z-c3ce45",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190212Z-98cf01",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-af576a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-abf012",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-c00508",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-6cdd80",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-0ed4ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        