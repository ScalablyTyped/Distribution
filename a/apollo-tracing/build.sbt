organization := "org.scalablytyped"
name := "apollo-tracing"
version := "0.8.5-30d89a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-b49b3e",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-d1718e",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-c3dce0",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-4652a1",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-28266d",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b8febd",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        