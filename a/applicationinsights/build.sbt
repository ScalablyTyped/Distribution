organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-4cb912"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.2-dt-20180624Z-9bde8d",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-22ca43",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-f9ddb2",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-eb2c5b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        