organization := "org.scalablytyped"
name := "ajv-errors"
version := "1.0-dt-20181017Z-e1e820"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7799d3",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cbad63",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6f3a8b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-d68e3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        