organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20180513Z-b8f35d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-fc197b",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-78bd79",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-8a36c4",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20180529Z-88d1ab",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20180529Z-d631d7",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-4db598",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        