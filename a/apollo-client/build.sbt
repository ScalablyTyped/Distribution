organization := "org.scalablytyped"
name := "apollo-client"
version := "2.4.8-16121e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-9d6ea7",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-efbf25",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-ba8e89",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-9a220d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-0934bb",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-0b86c7",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-e939a5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-bcca04")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        