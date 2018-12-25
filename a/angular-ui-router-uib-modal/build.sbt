organization := "org.scalablytyped"
name := "angular-ui-router-uib-modal"
version := "0.0.11-89fc10"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-a51b52",
  "org.scalablytyped" %%% "angular-ui-bootstrap" % "0.13.3-dt-20180721Z-d8161c",
  "org.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20180214Z-94f33f",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        