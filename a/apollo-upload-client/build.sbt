organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-17912f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-eb52ae",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.15-518a4e",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-0110b9",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ae2a8e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-d85dc8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-569cc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        