organization := "org.scalablytyped"
name := "appium-adb"
version := "9.10-dt-20221031Z-9f7f80"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-8bcab9",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "teen_process" % "2.0-dt-20221030Z-8e97d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
