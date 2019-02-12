organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.0-3a4151"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.0-37b029",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-de8aae",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-5b74a4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-10c485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        