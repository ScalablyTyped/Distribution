organization := "org.scalablytyped"
name := "authmosphere"
version := "2.2.1-3042c2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-07367a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-2e760b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b9978d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "http-status" % "v0.2.1-dt-20180214Z-249abc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "nock" % "v9.3.3-dt-20180628Z-54c20a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3967d2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-18a59e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        