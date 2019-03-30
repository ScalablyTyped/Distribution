organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20190213Z-14cb1c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-f3c4ac",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-8bb355",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-4e7130",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-d5bfc3",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-d8ecb2",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        