organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200515Z-78390b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-aaf354",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200515Z-3a12d8",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200515Z-621cae",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-808ee8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
