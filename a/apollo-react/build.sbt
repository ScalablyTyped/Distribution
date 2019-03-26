organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-ff2ab1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-13011f",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-27a688",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-74ff58",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.18-eb8534",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-c55d28",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-b55033",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-96551b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190214Z-b27717",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-10214a",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-55274c",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-b0b123",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20190322Z-2833ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "redux" % "4.0.1-436f26",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-ea625b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-b368b6",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-41d5e8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-e51018")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        