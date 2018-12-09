organization := "org.scalablytyped"
name := "ajv-errors"
version := "1.0-dt-20181018Z-f1666a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-a70ce9",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-f9cead",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-0a9ba8",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6f00bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        