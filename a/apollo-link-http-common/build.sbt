organization := "org.scalablytyped"
name := "apollo-link-http-common"
version := "0.2.14-c47148"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-4d60e6",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.4-a6b2bb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        