organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20180513Z-94d296"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-0d0a09",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-df4d21",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-bd4cb2",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20180529Z-2f9833",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20180529Z-b719bc",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-bf9e5e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        