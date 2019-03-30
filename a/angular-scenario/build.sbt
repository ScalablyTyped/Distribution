organization := "org.scalablytyped"
name := "angular-scenario"
version := "1.3-dt-20190322Z-e9f7d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-6a291a",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-6565a2",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cab61f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        