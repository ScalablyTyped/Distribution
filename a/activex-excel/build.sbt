organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20220705Z-f3e643"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-8ae2e5",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-fede1a",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-58f052",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-9edd8e",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-edc9d4",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-2f754e",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
