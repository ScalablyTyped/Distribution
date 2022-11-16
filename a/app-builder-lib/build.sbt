organization := "org.scalablytyped"
name := "app-builder-lib"
version := "23.6.0-075afa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-ddd4de",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-08a8ed",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-46fecc",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-bf05f7",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-fd88a4",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-2c3f54",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-fd205b",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-ad96d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
