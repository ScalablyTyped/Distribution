organization := "org.scalablytyped"
name := "amap-js-api-transfer"
version := "1.4-dt-20200127Z-0c5095"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20201028Z-e8f350",
  "org.scalablytyped" %%% "amap-js-api-place-search" % "1.4-dt-20190326Z-b4ee11",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
