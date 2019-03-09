organization := "org.scalablytyped"
name := "authmosphere"
version := "2.2.1-48c335"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c60c6c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a449b6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-48f106",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-deeb53",
  "org.scalablytyped" %%% "http-status" % "v0.2.1-dt-20180214Z-1cc9f9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "nock" % "v9.3.3-dt-20190227Z-e09f01",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-78bbd1",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-49c2de")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        