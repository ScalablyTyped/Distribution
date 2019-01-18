organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20180513Z-9e1bea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-df4d21",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-bd4cb2",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-9e85f6",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-c6c518",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-bf9e5e",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180513Z-de3eab",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        