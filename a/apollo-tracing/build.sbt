organization := "org.scalablytyped"
name := "apollo-tracing"
version := "0.4.0-3917b9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-6ccb23",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-360fbe",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-ba95be",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-3acce5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "graphql-extensions" % "0.4.0-035c87",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-7e731a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        