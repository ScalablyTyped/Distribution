organization := "org.scalablytyped"
name := "apollo-graphql"
version := "0.1.3-b8f5a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.4.0-f2388e",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-31b7c8",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-b55033",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-8678eb",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "sha_dot_js" % "2.4-dt-20181126Z-ab30f5",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        