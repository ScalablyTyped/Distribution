organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.1-cabd0d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-93922a",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-c8d360",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-1ff40f",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-da59e9",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-31fee9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        