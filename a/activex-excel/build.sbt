organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20180910Z-b6ca46"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180910Z-5ae05b",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180910Z-d80324",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-4c3e82",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-539cd9",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180910Z-09b01c",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180910Z-37434b",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180910Z-2c1922",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180910Z-c130e0",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        