organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20180513Z-fdff3a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-19087c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-e6877b",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-3a3f46",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-afb402",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-c0ffd9",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        