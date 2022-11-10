organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20220705Z-78fca4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-2a7d2a",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-7d02ce",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-38176f",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-43e09c",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-ce0876",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-080b8d",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
