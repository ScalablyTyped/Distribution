organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.19-172a76"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-f579dd",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-b94d3a",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        