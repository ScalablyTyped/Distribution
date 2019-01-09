organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20181003Z-b00d47"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20181206Z-f6c6f1",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-64ec94",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20180214Z-7d7321",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-7a79c0",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        