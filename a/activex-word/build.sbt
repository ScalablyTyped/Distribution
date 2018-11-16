organization := "com.scalablytyped"
name := "activex-word"
version := "14.0-dt-20181102Z-1b6d6d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "activex-helpers" % "1.0.2-c646e3",
  "com.scalablytyped" %%% "activex-interop" % "0.0-dt-20181102Z-530221",
  "com.scalablytyped" %%% "activex-office" % "16.0-dt-20181102Z-4475fd",
  "com.scalablytyped" %%% "activex-outlook" % "14.0-dt-20181102Z-862f97",
  "com.scalablytyped" %%% "activex-stdole" % "2.0-dt-20181102Z-9ce58b",
  "com.scalablytyped" %%% "activex-vbide" % "14.0-dt-20181102Z-4112a1",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        