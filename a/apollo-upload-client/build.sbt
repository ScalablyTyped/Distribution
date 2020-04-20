organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-50d462"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-d0a417",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.16-2f5056",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-b8e9a6",
  "org.scalablytyped" %%% "graphql" % "14.6.0-d18599",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-c6e790")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
