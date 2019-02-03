organization := "org.scalablytyped"
name := "apollo-cache-control"
version := "0.4.1-47d34a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.3.1-0871b2",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-015948",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.1-773d8e",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8a719e",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-beaee2",
  "org.scalablytyped" %%% "graphql-extensions" % "0.4.2-465a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d2c791",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-10c485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        