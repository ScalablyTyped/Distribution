organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.1-f1887a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-ec63aa",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-2c9e31",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-47a544",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-4a070f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-10c485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        