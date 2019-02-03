organization := "org.scalablytyped"
name := "activex-adox"
version := "6.0-dt-20180513Z-6d199e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-866c1c",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-4a819c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-b41a75",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        