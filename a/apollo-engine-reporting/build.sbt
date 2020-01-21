organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.4.14-e0a8a7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-ad40b5",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-bdb6c2",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-8bd546",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-4ffafe",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-9f99ab",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ac6a9e",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.10-21770b",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-6241aa",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        