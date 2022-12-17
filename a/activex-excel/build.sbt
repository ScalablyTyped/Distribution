organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20220705Z-457221"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-23e0ba",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-898e81",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-d662cc",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-913e74",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-01ca5b",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-654749",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
