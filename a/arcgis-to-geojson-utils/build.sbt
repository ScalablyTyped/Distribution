organization := "com.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20180910Z-0dcdae"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20180910Z-8240ac",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-60feb0",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        