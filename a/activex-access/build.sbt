organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20180910Z-c4db98"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180910Z-df6e73",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180910Z-dfd402",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-61c8f7",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-592e85",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180910Z-f9caba",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-f17656",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180910Z-6ff377",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        