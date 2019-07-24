organization := "org.scalablytyped"
name := "apollo-client"
version := "2.6.3-500c18"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-41f07e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-66afb6",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-609be7",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-ce53a0",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-d26bdd",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-974c80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        