organization := "com.scalablytyped"
name := "apollo-datasource"
version := "0.2.1-a813de"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-server-caching" % "0.2.1-6b3583",
  "com.scalablytyped" %%% "apollo-server-env" % "2.2.0-934797",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-8c9e0c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-0916c6",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-8a2876",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        