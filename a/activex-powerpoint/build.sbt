organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20180513Z-9f3218"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-4a819c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-b41a75",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-cc6eda",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-be87f4",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-24b703",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180513Z-205976",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        