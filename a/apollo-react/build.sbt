organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-e019fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-de24c2",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-bc27a7",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-4cdbff",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-dc9e31",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-46ed8a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "redux" % "4.0.1-1382e4",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-b22f6e",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fdede1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-bbb22f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        