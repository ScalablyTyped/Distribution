organization := "org.scalablytyped"
name := "absinthe__socket-apollo-link"
version := "0.2-dt-20200623Z-d98430"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "absinthe__socket" % "0.2-dt-20200616Z-297c9b",
  "org.scalablytyped" %%% "apollo-link" % "1.2.14-246d1b",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "phoenix" % "1.4-dt-20200408Z-aa38cd",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.21-e83db8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
