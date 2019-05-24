organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-70053b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.0-fc1278",
  "org.scalablytyped" %%% "apollo-client" % "2.6.0-2b91c4",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-987548",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-7e0ab5",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3a9110",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-9d1c81",
  "org.scalablytyped" %%% "redux" % "4.0.1-76f17e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-bb55c1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fe60de",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        