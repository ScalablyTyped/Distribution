organization := "com.scalablytyped"
name := "apn"
version := "2.2.0-c4b9ec"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181102Z-4d55c2",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181102Z-de1b20",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "verror" % "1.10-dt-20181102Z-fde13c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        