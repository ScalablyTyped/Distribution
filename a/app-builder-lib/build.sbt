organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.43.0-a64fd0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "10.0.2-90fcfe",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.4-a085f1",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-d9f6d1",
  "org.scalablytyped" %%% "electron-publish" % "20.43.0-2f6124",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-1201b8",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-de5827",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-090453")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        