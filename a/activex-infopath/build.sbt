organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20180910Z-3c3c61"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180910Z-df6e73",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-61c8f7",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-592e85",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20180910Z-2b1635",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20180910Z-eb0e08",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-f17656",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        