organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20180522Z-019f63"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-f825e2",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180513Z-737f0f",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-7cdc7b",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-c71a8d",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-5b4321",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-5f2c3a",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-546b2f",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180513Z-b2a105",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        