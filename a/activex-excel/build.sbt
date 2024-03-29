organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20230328Z-6dc463"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20230328Z-efdd3f",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-f2d10f",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20230328Z-58a0c2",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20230328Z-a72389",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20230328Z-30186b",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20230328Z-7e8485",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
