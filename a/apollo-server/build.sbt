organization := "org.scalablytyped"
name := "apollo-server"
version := "2.6.2-d1c1af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-1d20bf",
  "org.scalablytyped" %%% "apollo-server-express" % "2.6.2-9ebb67",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-51a501",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0a8905",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-f5f359",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e17ce1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-1f4573",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-a67bc6",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-202c67",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-83e0be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3a476c",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7ac41d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        