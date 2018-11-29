organization := "com.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20180910Z-6f44bb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180910Z-7a2ecf",
  "com.scalablytyped" %%% "activex-helpers" % "1.0.2-85dea5",
  "com.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-0bc3c4",
  "com.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20180910Z-143002",
  "com.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20180910Z-602953",
  "com.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-a89938",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        