organization := "org.scalablytyped"
name := "apollo__react-hooks"
version := "3.1.3-0055c9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-9cdace",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-e4bdbf",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-691065",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-38e372",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-6859a2",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "graphql" % "14.6.0-f78e99",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200225Z-6417d3",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
