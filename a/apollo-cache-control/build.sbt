organization := "org.scalablytyped"
name := "apollo-cache-control"
version := "0.8.10-a3ed5e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-aeac1e",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-cb1394",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-35b7f0",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-f38334",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-315224",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.9-28a1fd",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-377e28",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        