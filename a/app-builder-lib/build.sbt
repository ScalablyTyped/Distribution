organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.39.0-1ee02c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-13c73d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-74afbb",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-da708a",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-0e810d",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-6385ca",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-39fe74",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-e0982f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        