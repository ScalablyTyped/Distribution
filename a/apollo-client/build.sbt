organization := "org.scalablytyped"
name := "apollo-client"
version := "2.5.1-bc27a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-de24c2",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-4cdbff",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-dc9e31",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-46ed8a",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fdede1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-bbb22f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        