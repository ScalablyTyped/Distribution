organization := "org.scalablytyped"
name := "apollo-client"
version := "2.6.0-c0b40c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.0-69d39f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-527c94",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-0833cd",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3e2174",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-e95603",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-508485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        