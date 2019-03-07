organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.8-bf6ccf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.8-d029d2",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.8-c40f95",
  "org.scalablytyped" %%% "angular__core" % "7.2.8-d95249",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.8-a2dad6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-1dd9f6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-2acb83")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        