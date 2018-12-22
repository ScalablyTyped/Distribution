organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20180513Z-e8ce3c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-78bd79",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-8a36c4",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-5bd583",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-9c6f49",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-4db598",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        