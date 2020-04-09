organization := "org.scalablytyped"
name := "apollo-cache-control"
version := "0.9.1-4ce8e8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-70c1d0",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-8cb469",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-b91220",
  "org.scalablytyped" %%% "apollo-server-types" % "0.3.1-21b2b8",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-42037c",
  "org.scalablytyped" %%% "graphql" % "14.6.0-f78e99",
  "org.scalablytyped" %%% "graphql-extensions" % "0.11.1-3f6ec0",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200226Z-abc547",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
