organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-cb696a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.3-dt-20190303Z-a00066",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-4e7bf6",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-5959fe",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-1c2fb8",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        