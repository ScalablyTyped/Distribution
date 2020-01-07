organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.4.13-19f53f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-dc864d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-9d0235",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-5fb1ac",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-98414a",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-2fccf0",
  "org.scalablytyped" %%% "graphql" % "14.5.8-216385",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.9-233b4d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-f5dfe8",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        