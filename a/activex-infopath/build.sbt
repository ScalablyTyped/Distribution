organization := "com.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20180910Z-bb2093"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180910Z-017b22",
  "com.scalablytyped" %%% "activex-helpers" % "1.0.2-38e219",
  "com.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-d387fd",
  "com.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20180910Z-adbbed",
  "com.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20180910Z-d4db7f",
  "com.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-d95ce7",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        