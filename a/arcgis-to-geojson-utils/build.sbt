organization := "org.scalablytyped"
name := "arcgis-to-geojson-utils"
version := "1.0-dt-20180214Z-40b5d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20190213Z-e1f7c6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-ed63b4",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        