organization := "com.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20180910Z-d2285f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "activex-helpers" % "1.0.2-38e219",
  "com.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-d387fd",
  "com.scalablytyped" %%% "activex-office" % "16.0-dt-20180910Z-b6b657",
  "com.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-d95ce7",
  "com.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180910Z-14b6a8",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        