organization := "org.scalablytyped"
name := "angular-ui-router-uib-modal"
version := "0.0.11-a6eeb0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-6a291a",
  "org.scalablytyped" %%% "angular-ui-bootstrap" % "0.13.3-dt-20190322Z-700030",
  "org.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20190322Z-a820b3",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        