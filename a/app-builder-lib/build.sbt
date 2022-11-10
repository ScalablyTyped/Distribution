organization := "org.scalablytyped"
name := "app-builder-lib"
version := "23.6.0-e49c06"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-3ab26f",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-dd2ab3",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-03d2f5",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-34836b",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-933f08",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-6a3353",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-2e9b1a",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-c492eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
