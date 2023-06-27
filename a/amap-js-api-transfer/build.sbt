organization := "org.scalablytyped"
name := "amap-js-api-transfer"
version := "1.4-dt-20220624Z-66e3a1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20230328Z-c818f3",
  "org.scalablytyped" %%% "amap-js-api-place-search" % "1.4-dt-20211202Z-5157ea",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
