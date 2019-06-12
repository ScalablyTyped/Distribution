organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.6.3-852b4d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-d56c94",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f89d38",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-ee80d6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-47e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-ae49a5",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-1af13e",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-903424",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-335742",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51fe5c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-39a594",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c829e9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4da704")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        