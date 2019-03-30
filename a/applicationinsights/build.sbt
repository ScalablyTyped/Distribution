organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-20b3b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.3-dt-20190303Z-596386",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-6815ed",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-8094b1",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-86cc68",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        