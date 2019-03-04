organization := "org.scalablytyped"
name := "angular-ui-sortable"
version := "0.13-dt-20181017Z-e06ceb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-b19f07",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f5a31c",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20190124Z-af1e30",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b709fe",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        