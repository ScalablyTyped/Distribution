organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-7144fa"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-4ab209",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-45fb28",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20200515Z-48817a",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-c7b96e",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-954966",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-b0194e",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-3426b3",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
