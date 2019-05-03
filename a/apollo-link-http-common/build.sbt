organization := "org.scalablytyped"
name := "apollo-link-http-common"
version := "0.2.13-ae115f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3e2f2b",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-1cfd76",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        