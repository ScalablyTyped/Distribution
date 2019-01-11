organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20181003Z-88d3d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20181206Z-73b8ce",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-1551fb",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20180214Z-ee8442",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-1e0ea5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        