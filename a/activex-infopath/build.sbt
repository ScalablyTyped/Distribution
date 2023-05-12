organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20230328Z-b26af2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20230328Z-bbbafb",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20230328Z-9edb24",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20220705Z-3b7143",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20230328Z-9a0dd5",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
