organization := "org.scalablytyped"
name := "ag-simple-broker"
version := "5.0-dt-20220215Z-47cc9e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-2ed9ca",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-64f987",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-4d3c8d",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-1a55dd",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ec692a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
