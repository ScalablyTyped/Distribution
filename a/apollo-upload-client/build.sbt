organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20181017Z-771d35"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-5dd416",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.8-7788b6",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-084adf",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-3d816b",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-3245d4",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76c70f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-850d40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        