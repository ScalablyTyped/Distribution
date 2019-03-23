organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-7b3eaf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-0ddbab",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "samchon" % "2.1.4-2145bc",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "sxml" % "1.0.3-456a28",
  "org.scalablytyped" %%% "tstl" % "2.1.2-b38a31",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-0bab5d",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20190322Z-ccb29c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        