organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-113255"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-838fd2",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "samchon" % "2.1.4-7220b5",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "sxml" % "1.0.3-827ab1",
  "org.scalablytyped" %%% "tstl" % "2.1.2-5790fb",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-09c5bf",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-ece933")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        