organization := "org.scalablytyped"
name := "asyncblock-generators"
version := "2.2.12-7a6a3a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "esprima" % "4.0-dt-20180910Z-d34a5f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-cc85a5",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        