organization := "org.scalablytyped"
name := "angular__forms"
version := "7.1.3-11a733"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.1.3-7f5b9b",
  "org.scalablytyped" %%% "angular__core" % "7.1.3-81cc67",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.1.3-cf56c2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-e2dd16",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.26-1c9482")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        