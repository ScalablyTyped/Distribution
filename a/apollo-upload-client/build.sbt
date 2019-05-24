organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20181017Z-faa4c8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-987548",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.13-49f7d2",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-632d26",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3a9110",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.2-e39cd5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        