organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-23ff2d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-75b640",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "samchon" % "2.1.4-0a587b",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "sxml" % "1.0.3-8d03f1",
  "org.scalablytyped" %%% "tstl" % "2.1.1-8bca61",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-fcb576",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-3681c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        