organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-e3901d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-824d3c",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.15-f52f3f",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-95ac2a",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
