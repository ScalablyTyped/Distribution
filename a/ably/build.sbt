organization := "org.scalablytyped"
name := "ably"
version := "1.0.21-644096"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ca4bc1",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-efd843",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-d2b9fb",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-641db8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        