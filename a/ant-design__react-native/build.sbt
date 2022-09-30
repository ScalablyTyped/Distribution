organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "5.0.1-e5757f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-da1d63",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220927Z-e8ccda",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.6.0-a2c503",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.6.2-cfa206",
  "org.scalablytyped" %%% "react-native-modal-popover" % "2.1.0-a7f5e9",
  "org.scalablytyped" %%% "react-native-picker__picker" % "2.4.4-52009f",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-1f8014",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
