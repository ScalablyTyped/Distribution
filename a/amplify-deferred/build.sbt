organization := "com.scalablytyped"
name := "amplify-deferred"
version := "1.1-dt-20181102Z-bb85a5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "amplify" % "1.1-dt-20181102Z-4f5d92",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181102Z-ef9974",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181102Z-6214b8",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        