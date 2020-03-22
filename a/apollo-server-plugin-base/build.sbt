organization := "org.scalablytyped"
name := "apollo-server-plugin-base"
version := "0.6.10-9d97f1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-85f674",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-8cb469",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-d74f6e",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-bc2c73",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-934211",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200122Z-abc547",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
