organization := "org.scalablytyped"
name := "apollo-server-types"
version := "0.5.1-667871"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.5.2-7bf1ab",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.2-a2f0fe",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.5-c3ff1e",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.4-f72edf",
  "org.scalablytyped" %%% "graphql" % "14.6.0-578a82",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200515Z-104b3d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
