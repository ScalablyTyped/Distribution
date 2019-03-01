organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-3983f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.2-dt-20180624Z-f67d7b",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-1ea83a",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-010625",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-c07618",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        