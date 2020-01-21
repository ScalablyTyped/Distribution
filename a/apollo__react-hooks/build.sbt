organization := "org.scalablytyped"
name := "apollo__react-hooks"
version := "3.1.3-156e8e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-24a04f",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-8a2c46",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-c36848",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-185d06",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-833fc0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ac6a9e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-0b3176",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-610cde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        