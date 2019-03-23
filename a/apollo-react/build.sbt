organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-ed3427"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-2e1d16",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-424566",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-e13a57",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.18-245e30",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-da0a30",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-aa9287",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-bffeb5",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-662401",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190214Z-e05308",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-06616f",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-739da4",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-c28106",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20190322Z-5fa551",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-6f0f1a",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-6c21c8",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-3eff9b",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-4a9f67",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-3d5d0d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        