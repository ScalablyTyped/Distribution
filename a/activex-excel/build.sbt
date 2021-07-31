organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20201028Z-9d9f31"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-aaf354",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20201028Z-bca086",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20201028Z-37f94e",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200515Z-59c20f",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-808ee8",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200515Z-6bc4b8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
