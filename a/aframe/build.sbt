organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20190328Z-f79927"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "three" % "0.103.0-1079d6",
  "org.scalablytyped" %%% "tween_dot_js" % "17.2-dt-20190124Z-227e63")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        