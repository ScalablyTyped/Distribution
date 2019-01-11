organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-d7d3cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-a72459",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-724765",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-512db1",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-6d593a",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c80c1a",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-cb936f",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-807d57",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-5edd6b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180723Z-d013b4",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-8e1ed0",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-b7a802",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180723Z-73bcd0",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-f0cd02",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "redux" % "4.0.1-44220d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-48f0b2",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-1f070e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-94c887")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        