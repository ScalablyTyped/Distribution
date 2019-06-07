organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.43.0-ae28b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "10.0.2-dd1338",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.4-5d3f48",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-3517db",
  "org.scalablytyped" %%% "electron-publish" % "20.43.0-f28098",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-104553",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-a3db3b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-372092")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        