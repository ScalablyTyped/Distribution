organization := "org.scalablytyped"
name := "app-builder-lib"
version := "23.6.0-2d99b1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-b6b267",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-3233a7",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-00fd1d",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-86bf34",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-e5ceff",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-7cad88",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-44eadb",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-bb7ae5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
