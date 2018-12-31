organization := "org.scalablytyped"
name := "angular__forms"
version := "7.1.4-1f7651"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.1.4-481347",
  "org.scalablytyped" %%% "angular__core" % "7.1.4-ba9c01",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.1.4-da3301",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-04e169",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.26-691c73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        