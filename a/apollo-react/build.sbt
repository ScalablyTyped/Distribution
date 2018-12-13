organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-1726b0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-bc8bfc",
  "org.scalablytyped" %%% "apollo-client" % "2.4.7-f2e665",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-835191",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-cff50d",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-7c4334",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-2b5950",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-8c7bdd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180910Z-9aea70",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-d633a4",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-71d5d0",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-f2f700",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-e0abbd",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "redux" % "4.0.1-7c9b0b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-9c5f49",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-6efe62",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-b2ad40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        