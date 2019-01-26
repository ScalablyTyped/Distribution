organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.2.2-ed9634"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.2-2a3504",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-cba34a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-60874b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-66b2ff",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-0f5ab0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        