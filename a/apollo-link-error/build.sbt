organization := "org.scalablytyped"
name := "apollo-link-error"
version := "1.1.12-c84290"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-2b791a",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.15-60dfbe",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-a0ff0e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-6da803")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        