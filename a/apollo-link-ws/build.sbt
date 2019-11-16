organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-db1561"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-739503",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-8e2bd2",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        