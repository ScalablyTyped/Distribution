organization := "com.scalablytyped"
name := "apollo-react"
version := "0.7.1-5962e8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-cache" % "1.1.17-81519c",
  "com.scalablytyped" %%% "apollo-client" % "2.4.2-164b00",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-ed789a",
  "com.scalablytyped" %%% "apollo-link-dedup" % "1.0.10-44b4bf",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.21-6af781",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "fclone" % "1.0.11-4304d4",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-4871a9",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-19b6d2",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-c8b620",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180910Z-c0a5dc",
  "com.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-15c31a",
  "com.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-eb876c",
  "com.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-9937b1",
  "com.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-422e86",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "redux" % "4.0.1-d3681d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "com.scalablytyped" %%% "typed-graphql" % "1.0.2-98ba21",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-2ae465",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-36203d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        