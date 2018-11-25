organization := "com.scalablytyped"
name := "antd"
version := "3.10.1-183b0e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ant-design__icons" % "1.1.15-11d199",
  "com.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-9b55b9",
  "com.scalablytyped" %%% "array-tree-filter" % "2.1.0-f3dda8",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d7884f",
  "com.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-a140c7",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-8a5181",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-d795bb",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "moment" % "2.22.2-b3769a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "rc-calendar" % "9.7.10-4a2f7f",
  "com.scalablytyped" %%% "rc-dialog" % "7.2.1-130267",
  "com.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-771c4e",
  "com.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-5cc313",
  "com.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-934bb0",
  "com.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-a2d603",
  "com.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-6433d4",
  "com.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-f6d572",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-3c408d",
  "com.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-8c89bd",
  "com.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-9e377c",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-ab83dd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        