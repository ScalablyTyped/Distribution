organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-4475b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-00a480",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "samchon" % "2.1.4-bd19b3",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "sxml" % "1.0.3-726a70",
  "org.scalablytyped" %%% "tstl" % "2.1.2-f30ebc",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-28e2eb",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-1ef846")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        