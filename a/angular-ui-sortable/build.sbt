organization := "org.scalablytyped"
name := "angular-ui-sortable"
version := "0.13-dt-20181017Z-c8fd7b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-f970f0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-7adbea",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20190124Z-28bddc",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b13b7f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        