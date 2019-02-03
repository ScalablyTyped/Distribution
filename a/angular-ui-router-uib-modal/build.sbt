organization := "org.scalablytyped"
name := "angular-ui-router-uib-modal"
version := "0.0.11-45c90b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-d33dcd",
  "org.scalablytyped" %%% "angular-ui-bootstrap" % "0.13.3-dt-20180721Z-d22ef1",
  "org.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20180214Z-acc58d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        