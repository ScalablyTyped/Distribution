organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.4.3-e02917"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-dc2d6d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-595810",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-0c8051",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-f95c4b",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-9b3683",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.1-386f6f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-7025bc",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        