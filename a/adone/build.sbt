organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20181003Z-06433c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20181206Z-3d978d",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-0b1654",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20180214Z-75eb42",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-3650a8",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        