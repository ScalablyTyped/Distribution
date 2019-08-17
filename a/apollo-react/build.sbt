organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-f9aa53"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-d8cbc8",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-2939d1",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-8d970c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-9781a4",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-9b3683",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "redux" % "4.0.4-1adc8c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-0f1f96",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-359560",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-4a2209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        