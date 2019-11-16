organization := "org.scalablytyped"
name := "apollo-tracing"
version := "0.8.5-66dd27"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-32ae6a",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-819dc7",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-e1daeb",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-32e593",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-af407f",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        