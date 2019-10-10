organization := "org.scalablytyped"
name := "apollo-server-plugin-base"
version := "0.6.4-29af9b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-5c192e",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-3d79f9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-8beed2",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-e73dbe",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ae2a8e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d60ad2",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        