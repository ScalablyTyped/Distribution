organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-fbbb42"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-80c157",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-42062f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-d4b20d",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-2415f0",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-52c89b",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-904c02",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-3245d4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-9becb0",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-ed559c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180723Z-5efd88",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-8a9cff",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-9b6b5b",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180723Z-50da0b",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-4e14ab",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "redux" % "4.0.1-2c8d01",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-84d8b7",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76c70f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-850d40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        