organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20220705Z-73311b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-38176f",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-43e09c",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-ce0876",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-080b8d",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
