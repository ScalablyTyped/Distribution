organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-ac5dcb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.3-dt-20190303Z-ce3811",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-7f2b13",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-3b0660",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-ea5646",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        