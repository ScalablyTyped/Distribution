organization := "org.scalablytyped"
name := "app-builder-lib"
version := "21.2.0-cc6ab6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-ac4aa4",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-44e311",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-56a6ae",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-0d00c0",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20190626Z-85f75a",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-893e93",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-7311a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        