organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20180513Z-a4fcbe"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-7ee88e",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-efaa82",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-6fedcd",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20180529Z-914e04",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20180529Z-c839fd",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-e09b5f",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        