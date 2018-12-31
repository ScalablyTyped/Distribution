organization := "org.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20180214Z-16f8b8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20180214Z-54e804",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-43492e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        