organization := "org.scalablytyped"
name := "apollo-client"
version := "2.5.1-27a688"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-13011f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-74ff58",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.18-eb8534",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-c55d28",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-b55033",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-ea625b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-41d5e8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-e51018")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        