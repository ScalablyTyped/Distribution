organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-b1a534"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-5b0ccb",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-f6841f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3e2f2b",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-a9c263",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-19278e",
  "org.scalablytyped" %%% "redux" % "4.0.1-76f17e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-bb55c1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fe60de",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        