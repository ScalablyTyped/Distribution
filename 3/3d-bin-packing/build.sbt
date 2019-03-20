organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-97e7e2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-0ddbab",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "samchon" % "2.1.4-1e5bd1",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "sxml" % "1.0.3-456a28",
  "org.scalablytyped" %%% "tstl" % "2.1.2-b38a31",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-0bab5d",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-0dd486")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        