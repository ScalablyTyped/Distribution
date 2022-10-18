organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "5.0.2-f9f9c6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-a0e65e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221016Z-c1c8c7",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.6.0-12ec34",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.7.1-36cd52",
  "org.scalablytyped" %%% "react-native-modal-popover" % "2.1.0-58b762",
  "org.scalablytyped" %%% "react-native-picker__picker" % "2.4.7-efb687",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-dc4815",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
