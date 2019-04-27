organization := "org.scalablytyped"
name := "atom-mocha-test-runner"
version := "1.0-dt-20180214Z-ca0475"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "atom" % "1.36-dt-20190421Z-426fc6",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-a079dc",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        