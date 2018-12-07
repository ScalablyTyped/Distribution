organization := "org.scalablytyped"
name := "angular__forms"
version := "7.1.1-8ec073"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.1.1-c40034",
  "org.scalablytyped" %%% "angular__core" % "7.1.1-a34a59",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.1.1-b06b0f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-0ffcd9",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.26-3c34c9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        