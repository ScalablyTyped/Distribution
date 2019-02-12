organization := "org.scalablytyped"
name := "apn"
version := "2.2.0-3f9640"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-6ae341",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-019ccf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20180214Z-19a36b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        