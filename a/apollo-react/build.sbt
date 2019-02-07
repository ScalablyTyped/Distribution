organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-69b7c0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.25-0f7929",
  "org.scalablytyped" %%% "apollo-client" % "2.4.12-46abeb",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-11755c",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-dc96bd",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.2-380657",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-beaee2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c061a",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-d5355c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180723Z-2b9457",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-838c38",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-ec2659",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180723Z-f88551",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-af576a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
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
        