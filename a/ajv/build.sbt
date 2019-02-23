organization := "org.scalablytyped"
name := "ajv"
version := "6.9.2-4c4ed3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2cff45",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0009b8",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-194416")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        