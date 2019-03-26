organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.1-db19ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-7b211d",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-af581f",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-e00319",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-1ef774")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        