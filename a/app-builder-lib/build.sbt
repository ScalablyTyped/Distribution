organization := "org.scalablytyped"
name := "app-builder-lib"
version := "23.6.0-434dfb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-19a4a9",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-d54273",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-65abd5",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-32b576",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-5a2afc",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-019275",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-90f2dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
