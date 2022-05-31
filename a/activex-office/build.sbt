organization := "org.scalablytyped"
name := "activex-office"
version := "16.0-dt-20201028Z-a254b4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200515Z-ee6353",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-060e9a",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
