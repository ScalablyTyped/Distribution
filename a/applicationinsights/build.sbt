organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-d31331"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.2-dt-20180624Z-24ea8f",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-d726dd",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-010625",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-c07618",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        