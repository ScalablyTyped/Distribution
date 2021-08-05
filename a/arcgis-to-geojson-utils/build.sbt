organization := "org.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20200515Z-62f6db"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20200515Z-ca0f5b",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-ae1993",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
