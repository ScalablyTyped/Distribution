organization := "org.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20180214Z-f9dd2e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20180214Z-acbe03",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-5d845b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        