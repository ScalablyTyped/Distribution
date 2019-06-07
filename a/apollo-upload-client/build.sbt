organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20181017Z-a0cf26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-1d20bf",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.13-930633",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-23c1ea",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-a67bc6",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.2-5df7df",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7ac41d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        