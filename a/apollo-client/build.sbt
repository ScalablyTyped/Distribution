organization := "org.scalablytyped"
name := "apollo-client"
version := "2.6.4-2d947d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-f1876f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-3e9d24",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-18a762",
  "org.scalablytyped" %%% "graphql" % "14.5.8-92eff2",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-b9c39c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        