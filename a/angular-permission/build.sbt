organization := "com.scalablytyped"
name := "angular-permission"
version := "2.3.6-dt-20180910Z-d3bafb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-d10678",
  "com.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20180910Z-bb851c",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        