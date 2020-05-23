organization := "org.scalablytyped"
name := "apollo-client"
version := "2.6.10-161ffa"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.5-46ae40",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-a26a1b",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-35262f",
  "org.scalablytyped" %%% "graphql" % "14.6.0-2fa9e2",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200515Z-8f4b6c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-118859")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
