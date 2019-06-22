organization := "org.scalablytyped"
name := "apollo-server"
version := "2.6.4-6db4b3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-644548",
  "org.scalablytyped" %%% "apollo-server-express" % "2.6.4-2f6351",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d64a0e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a1e1e0",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-6c43c2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-cb6937",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-e7cc40",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-f0ece1",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-654583",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-37bb82",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a3667a",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        