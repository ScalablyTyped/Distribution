organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20220705Z-511e3d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-56118f",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-d95f16",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-197cd0",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-e49a47",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
