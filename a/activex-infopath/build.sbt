organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20220705Z-e8e6e1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-8ae2e5",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20220705Z-c128b9",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20220705Z-6d7200",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-edc9d4",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
