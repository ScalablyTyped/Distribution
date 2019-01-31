organization := "org.scalablytyped"
name := "apn"
version := "2.2.0-56628f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-175f9b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-6aab16",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20180214Z-8b383b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        