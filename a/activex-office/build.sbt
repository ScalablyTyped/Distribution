organization := "org.scalablytyped"
name := "activex-office"
version := "16.0-dt-20190213Z-58870d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-0a404f",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-9f0ec5",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-ee5873",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-7f78cc",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        