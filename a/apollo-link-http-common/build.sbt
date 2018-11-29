organization := "com.scalablytyped"
name := "apollo-link-http-common"
version := "0.2.6-743077"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.4-cf91b1",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.26-9dddf4",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-854602",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.11-bacf6e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        