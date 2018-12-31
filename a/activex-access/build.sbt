organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20180522Z-62d013"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-7ee88e",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180513Z-b6796f",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-efaa82",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-6fedcd",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-cfe1b2",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-5abdd1",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-e09b5f",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180513Z-8fbe5c",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        