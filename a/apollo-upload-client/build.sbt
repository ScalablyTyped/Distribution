organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190619Z-6d4b1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-5b52c0",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.14-f70613",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-d12ede",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-c591ae",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-3877e9",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-974c80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        