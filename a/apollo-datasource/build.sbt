organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.1-4594bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-b64c43",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-f08fa1",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-0943d0",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-121af0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        