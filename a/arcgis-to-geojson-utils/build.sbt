organization := "org.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20211202Z-7f5d94"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20211202Z-ac6e8d",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-89d05a",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
