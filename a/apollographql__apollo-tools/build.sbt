organization := "org.scalablytyped"
name := "apollographql__apollo-tools"
version := "0.2.9-2d9923"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-310fed",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-ec75e2",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-ed78a4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3aadd3",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        