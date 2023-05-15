organization := "org.scalablytyped"
name := "atlaskit__popper"
version := "5.5.2-43adb9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "atlaskit__in-product-testing" % "0.2.1-537e3d",
  "org.scalablytyped" %%% "buffer" % "6.0.3-acbfae",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "cypress" % "12.12.0-4ad2d2",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-a4982c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.7-5886e9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-098677",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-227892",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
