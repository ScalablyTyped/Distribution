organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-f01d63"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-a5838b",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-f3c4ac",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-8bb355",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-c121cc",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-e47053",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-d8ecb2",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        