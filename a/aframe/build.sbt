organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20181015Z-b961a2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "three" % "0.93-dt-20181210Z-e5ebcf",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180214Z-14962e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        