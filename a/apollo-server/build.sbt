organization := "org.scalablytyped"
name := "apollo-server"
version := "2.5.0-ede0f9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-527c94",
  "org.scalablytyped" %%% "apollo-server-express" % "2.5.0-318d30",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-9d64a8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3e2174",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-a03ceb",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-4472f3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-508485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        