organization := "org.scalablytyped"
name := "apollo-client"
version := "2.6.8-91abb1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-d05591",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-d0a417",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-0cd7af",
  "org.scalablytyped" %%% "graphql" % "14.6.0-d18599",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200225Z-4986bc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-c6e790")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
