organization := "org.scalablytyped"
name := "app-builder-lib"
version := "22.9.1-801589"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "22.9.1-e853d9",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.2-d0c96d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-7a466b",
  "org.scalablytyped" %%% "electron-publish" % "22.9.1-26f5ce",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20201111Z-423a6f",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-b4752e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-de78bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
