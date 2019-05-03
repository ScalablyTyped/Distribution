organization := "org.scalablytyped"
name := "apollo-server"
version := "2.4.8-7e141b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3e2f2b",
  "org.scalablytyped" %%% "apollo-server-express" % "2.4.8-f5f620",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-babc1e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db9829",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-d6d3fd",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4760bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-5e3ea9",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-ee1d18",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-18143d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a9f802",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        