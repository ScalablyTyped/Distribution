organization := "org.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20180214Z-e9a9df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20180214Z-a8014b",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-038c51",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        