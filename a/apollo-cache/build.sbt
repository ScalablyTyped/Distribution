organization := "org.scalablytyped"
name := "apollo-cache"
version := "1.2.1-244c1b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-e0abb3",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-9c7de5",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        