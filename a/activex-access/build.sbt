organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20180910Z-986830"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180910Z-2879d3",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180910Z-eddcb9",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-28f57e",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-978016",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180910Z-51049b",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-e1acc8",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180910Z-29c5d9",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        