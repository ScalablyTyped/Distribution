organization := "org.scalablytyped"
name := "apollo-link-error"
version := "1.1.11-696e65"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3add98",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.14-f1c06c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-39761a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.2-c29790",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        