organization := "com.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20181102Z-01a640"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "activex-adodb" % "6.1-dt-20181102Z-26c878",
  "com.scalablytyped" %%% "activex-helpers" % "1.0.2-c646e3",
  "com.scalablytyped" %%% "activex-interop" % "0.0-dt-20181102Z-530221",
  "com.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20181102Z-d361f1",
  "com.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20181102Z-ee70e9",
  "com.scalablytyped" %%% "activex-stdole" % "2.0-dt-20181102Z-9ce58b",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        