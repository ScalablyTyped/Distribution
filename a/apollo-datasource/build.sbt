organization := "com.scalablytyped"
name := "apollo-datasource"
version := "0.1.3-022e3c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-server-caching" % "0.1.2-2acd39",
  "com.scalablytyped" %%% "apollo-server-env" % "2.0.3-3138f5",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-02fd9c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-1f4e97",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-b2e03f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        