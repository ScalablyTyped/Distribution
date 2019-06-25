organization := "org.scalablytyped"
name := "apollo-client"
version := "2.6.3-56dcb8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-8989f3",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3add98",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-0e66bf",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-39761a",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-2b520b",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        