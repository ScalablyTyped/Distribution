organization := "org.scalablytyped"
name := "asyncblock"
version := "2.2.12-05f7ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asyncblock-generators" % "2.2.12-3d3e14",
  "org.scalablytyped" %%% "esprima" % "4.0-dt-20180501Z-88161b",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-dfeccf",
  "org.scalablytyped" %%% "fibers" % "0.0-unknown-dt-20180214Z-c3e6f7",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        