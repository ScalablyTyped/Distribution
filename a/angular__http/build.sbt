organization := "org.scalablytyped"
name := "angular__http"
version := "7.2.2-b543c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.2-8de9cc",
  "org.scalablytyped" %%% "angular__core" % "7.2.2-a94ee7",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.2-f0fe8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-181a55",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-6e36e5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        