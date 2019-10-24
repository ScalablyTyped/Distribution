organization := "org.scalablytyped"
name := "apollo-link-error"
version := "1.1.12-bcf020"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.15-610de9",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-297d7d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        