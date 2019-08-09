organization := "org.scalablytyped"
name := "angular-meteor"
version := "0.8-dt-20190322Z-7af8bf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190709Z-b96846",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4a549d",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "meteor" % "1.4-dt-20190717Z-337c86",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-e9a902")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        