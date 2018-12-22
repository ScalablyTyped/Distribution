organization := "org.scalablytyped"
name := "acl"
version := "0.4.8-dt-20180712Z-8ffc56"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-d496ac",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-899288",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20181221Z-6a733c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        