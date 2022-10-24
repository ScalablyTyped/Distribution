organization := "org.scalablytyped"
name := "ag-channel"
version := "5.0-dt-20220215Z-15b87a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2d64d4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-940a56",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7cb43e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
