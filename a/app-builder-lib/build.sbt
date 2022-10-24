organization := "org.scalablytyped"
name := "app-builder-lib"
version := "23.6.0-7ae278"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-39dd65",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-d7dedf",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-65abd5",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-1b2a20",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-251c82",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-019275",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-90f2dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
