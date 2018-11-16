organization := "com.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20181102Z-9f3c82"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20181102Z-73ac75",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20181102Z-d820c3",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        