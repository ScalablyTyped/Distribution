organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20220705Z-8fc2b1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-61d90f",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-e7dbb3",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-f4a5d8",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-1d982e",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-148e89",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-80652a",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
