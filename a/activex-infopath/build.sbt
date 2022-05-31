organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200515Z-f9a15b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-698658",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200515Z-b8ba46",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200515Z-8611e9",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-060e9a",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
