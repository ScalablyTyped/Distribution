organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-c710dd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-b12cab",
  "org.scalablytyped" %%% "apollo-client" % "2.4.7-788f97",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-d81515",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-293f53",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-6eebd1",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-505dae",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-dc38e6",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-2f0248",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180910Z-ec4607",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-86f08a",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-bb472b",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-27d6d3",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-5dc68a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "redux" % "4.0.1-580107",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-f95d86",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-671f25",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-74d34a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        