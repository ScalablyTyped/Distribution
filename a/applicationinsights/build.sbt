organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.1.0-6cd9d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.2-dt-20180624Z-de5e70",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-c2d47a",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-15e9f1",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.2.2-60fa46",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        