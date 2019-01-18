organization := "org.scalablytyped"
name := "asyncblock"
version := "2.2.12-bd95d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asyncblock-generators" % "2.2.12-734e24",
  "org.scalablytyped" %%% "esprima" % "4.0-dt-20180501Z-efe8f9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-ddf97e",
  "org.scalablytyped" %%% "fibers" % "0.0-unknown-dt-20180214Z-c39bdf",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        