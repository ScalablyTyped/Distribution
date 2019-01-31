organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.3-a7118a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.3-59f42f",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.3-e0e82a",
  "org.scalablytyped" %%% "angular__core" % "7.2.3-72652b",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.3-65ad5a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-183567",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-6e36e5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        