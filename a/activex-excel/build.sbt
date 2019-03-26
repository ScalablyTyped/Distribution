organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-0248d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-957cbf",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-c1fefe",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-a04cd0",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-6c6142",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-b5b6aa",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-914e6d",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-26e66b",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-277e00",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        