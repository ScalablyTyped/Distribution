organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-5b364e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-ef1703",
  "org.scalablytyped" %%% "apollo-client" % "2.4.7-813483",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-f5ddbe",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-53a150",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-181e22",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-f94ee7",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-2965d0",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-cbed6e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180910Z-947fec",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-ad0ca4",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-ea61ab",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-5a963a",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-b2186d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "redux" % "4.0.1-5c98ab",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-7434bc",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-cf13fe",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-203351")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        