organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-c943fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-6bd582",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "samchon" % "2.1.4-5514fa",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "sxml" % "1.0.3-3fda02",
  "org.scalablytyped" %%% "tstl" % "2.1.2-454738",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-7a27f4",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20190322Z-3cd436")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        