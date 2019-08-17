organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.18-b03cb8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-8d970c",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ea4c05",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-9b3683",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-330a63",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190805Z-9a238e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-4a2209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        