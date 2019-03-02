organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190228Z-a6d31b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-7367f3",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-e7e673",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-bfbf8a",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20180214Z-b2b423",
  "org.scalablytyped" %%% "buffer" % "5.2.1-a76575",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-2503b8",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        