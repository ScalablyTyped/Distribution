organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20190108Z-dba0b8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "three" % "0.93-dt-20190321Z-6d8140",
  "org.scalablytyped" %%% "tween_dot_js" % "17.2-dt-20190124Z-3f2d58")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        