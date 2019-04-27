organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.4.8-a0d240"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-b38978",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-3d760a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b0fe56",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-e58283",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-e7b69f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190423Z-a7e7ca",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-25f524",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-5269f8",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-d6c3c6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1ae06d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-9667a6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        