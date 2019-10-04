organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-5d7d24"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-5a2b8f",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.15-c5d034",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-06d8af",
  "org.scalablytyped" %%% "graphql" % "14.5.8-1773a0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-989ef2",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-62290b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        