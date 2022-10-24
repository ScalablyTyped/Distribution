organization := "org.scalablytyped"
name := "amap-js-api-geolocation"
version := "1.4-dt-20211202Z-1956ca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20220624Z-664e85",
  "org.scalablytyped" %%% "amap-js-api-geocoder" % "1.4-dt-20211202Z-f15ace",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
