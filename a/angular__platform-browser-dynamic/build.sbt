organization := "com.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.0.0-eed1f3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular__common" % "7.0.0-1854cb",
  "com.scalablytyped" %%% "angular__compiler" % "7.0.0-f4c60c",
  "com.scalablytyped" %%% "angular__core" % "7.0.0-a62394",
  "com.scalablytyped" %%% "angular__platform-browser" % "7.0.0-92c333",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "rxjs" % "6.3.3-71b0d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "zone_dot_js" % "0.8.26-791422",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        