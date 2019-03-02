organization := "org.scalablytyped"
name := "angular__platform-browser"
version := "7.2.7-202e84"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.7-ab84fd",
  "org.scalablytyped" %%% "angular__core" % "7.2.7-ac557d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-167391",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-029a8d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        