organization := "org.scalablytyped"
name := "apollo-server-plugin-base"
version := "0.6.1-b29926"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-3d2732",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-553b94",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-46a101",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-e09ad2",
  "org.scalablytyped" %%% "graphql" % "14.5.3-be513a",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-21aebd",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        