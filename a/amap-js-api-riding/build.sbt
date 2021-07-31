organization := "org.scalablytyped"
name := "amap-js-api-riding"
version := "1.4-dt-20190723Z-ef3d04"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20201028Z-212aa9",
  "org.scalablytyped" %%% "amap-js-api-place-search" % "1.4-dt-20190326Z-e59713",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
