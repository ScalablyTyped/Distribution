organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.4.7-711757"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-32ae6a",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-aa0c83",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-7d549f",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-981919",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-af407f",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        