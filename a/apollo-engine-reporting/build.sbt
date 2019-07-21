organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.4.0-53d036"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-55aef3",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-edaa6b",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-657021",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.0-495ce2",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-c591ae",
  "org.scalablytyped" %%% "graphql-extensions" % "0.8.0-2a5187",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-46fd4d",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        