organization := "org.scalablytyped"
name := "apollo-server-types"
version := "0.2.8-1a7245"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-9587e4",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-e1bc21",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-b8e6ba",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-f5282e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        