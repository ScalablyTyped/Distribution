organization := "com.scalablytyped"
name := "apollo-datasource"
version := "0.1.3-a2315a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-server-caching" % "0.1.2-967524",
  "com.scalablytyped" %%% "apollo-server-env" % "2.0.3-6c8a83",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20181102Z-59869e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181116Z-b7ed5a",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20181102Z-4b357b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        