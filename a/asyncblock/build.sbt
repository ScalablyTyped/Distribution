organization := "com.scalablytyped"
name := "asyncblock"
version := "2.2.12-bb4562"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asyncblock-generators" % "2.2.12-b4e9f1",
  "com.scalablytyped" %%% "esprima" % "4.0-dt-20180910Z-823318",
  "com.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-280628",
  "com.scalablytyped" %%% "fibers" % "0.0-unknown-dt-20180910Z-f7b336",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        