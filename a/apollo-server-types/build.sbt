organization := "org.scalablytyped"
name := "apollo-server-types"
version := "0.2.1-a3663b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-c6f06d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a37b56",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-a433cf",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4c5b4d",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        