organization := "org.scalablytyped"
name := "apollo__react-common"
version := "3.1.3-291cc5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-c70732",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-7b8487",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-d64a43",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-1f1123",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        