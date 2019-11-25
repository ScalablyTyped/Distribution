organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-978557"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aaa86d",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.15-92ffd7",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-214bcd",
  "org.scalablytyped" %%% "graphql" % "14.5.8-933f73",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-587e04",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        