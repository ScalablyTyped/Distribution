organization := "org.scalablytyped"
name := "apollo__react-hoc"
version := "3.1.3-de4039"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-fa0799",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-e61d17",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-824d3c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-22daf5",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-c6fa4a",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-6417d3",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
