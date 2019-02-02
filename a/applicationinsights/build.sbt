organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.1.0-5e8264"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.2-dt-20180624Z-85f748",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-3f7df9",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-53326c",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.2.2-f377a8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        