organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.44.2-cba69e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "10.1.0-92b5db",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-db573d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-9902a3",
  "org.scalablytyped" %%% "electron-publish" % "20.44.2-078fe5",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-b7d061",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-806fa0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "temp-file" % "3.3.3-92f2eb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        