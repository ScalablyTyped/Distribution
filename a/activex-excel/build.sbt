organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20220705Z-8df0df"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-e9599c",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-29bdc4",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-196dee",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-b804c3",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-6d165f",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-0292f1",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
