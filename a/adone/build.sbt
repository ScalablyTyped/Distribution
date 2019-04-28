organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-ec5579"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-e298b4",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-5fd0a3",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-c03c7a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-727e25",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        