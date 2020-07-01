organization := "org.scalablytyped"
name := "absinthe__socket-apollo-link"
version := "0.2-dt-20200623Z-de494d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "absinthe__socket" % "0.2-dt-20200616Z-cb9c0b",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-6f7d74",
  "org.scalablytyped" %%% "graphql" % "14.6.0-578a82",
  "org.scalablytyped" %%% "phoenix" % "1.4-dt-20200408Z-02c678",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-71140e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
