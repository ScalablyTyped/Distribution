organization := "org.scalablytyped"
name := "amap-js-api-riding"
version := "1.4-dt-20211202Z-b14735"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20221114Z-ffcfcc",
  "org.scalablytyped" %%% "amap-js-api-place-search" % "1.4-dt-20211202Z-5e7a83",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
