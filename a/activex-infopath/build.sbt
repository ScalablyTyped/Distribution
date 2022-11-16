organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20220705Z-f18db9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-e9599c",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20220705Z-9385d5",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20220705Z-edb07e",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-6d165f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
