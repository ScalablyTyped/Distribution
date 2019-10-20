organization := "org.scalablytyped"
name := "app-builder-lib"
version := "21.2.0-898b82"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-6b21b1",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-f653ec",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-3d3404",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-b557c8",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-7e596c",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-03a464",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-8963f5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        