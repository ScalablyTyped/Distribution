organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-8c4518"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-e87821",
  "org.scalablytyped" %%% "apollo-client" % "2.4.7-ceb9bc",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-b0ec7c",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-886972",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-062b35",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-5410a5",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-fb4ed9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180910Z-7dfd7a",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-9658d3",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-feedbb",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-fa457c",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-15641b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "redux" % "4.0.1-927e78",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-3898a1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-962402",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-76cd5d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        