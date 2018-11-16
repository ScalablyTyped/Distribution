organization := "com.scalablytyped"
name := "angular__platform-browser"
version := "7.0.2-7c27a0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular__common" % "7.0.2-5a11de",
  "com.scalablytyped" %%% "angular__core" % "7.0.2-5a9bec",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "rxjs" % "6.3.3-d50abd",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "zone_dot_js" % "0.8.26-8642cc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        