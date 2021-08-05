organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20201028Z-88d1f3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-942638",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20201028Z-95237a",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20201028Z-5ef735",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200515Z-cd8998",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-5a2b23",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200515Z-0e4d30",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
