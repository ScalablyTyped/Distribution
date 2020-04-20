organization := "org.scalablytyped"
name := "apollo-tracing"
version := "0.9.1-15ba47"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-2f54ec",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-b472d8",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-ece472",
  "org.scalablytyped" %%% "apollo-server-types" % "0.3.1-aa5127",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-672368",
  "org.scalablytyped" %%% "graphql" % "14.6.0-d18599",
  "org.scalablytyped" %%% "graphql-extensions" % "0.11.1-42a53b",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200226Z-571776",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
