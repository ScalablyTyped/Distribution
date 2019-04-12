organization := "org.scalablytyped"
name := "authmosphere"
version := "2.2.1-e3d1d6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d1ac4d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-751003",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6ba758",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-92341b",
  "org.scalablytyped" %%% "http-status" % "v0.2.1-dt-20190322Z-5fcf2b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "nock" % "v9.3.3-dt-20190322Z-dc1b78",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190411Z-5a2eed",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-84d26d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-e88380")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        