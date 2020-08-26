organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-7f183b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.14-246d1b",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.16-44973f",
  "org.scalablytyped" %%% "extract-files" % "8.1-dt-20200712Z-eccc2c",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.21-e83db8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
