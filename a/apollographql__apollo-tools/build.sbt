organization := "org.scalablytyped"
name := "apollographql__apollo-tools"
version := "0.3.5-f7b314"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.4.0-aa1f3e",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-e3cd2d",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-aa9287",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-c5e18b",
  "org.scalablytyped" %%% "sha_dot_js" % "2.4-dt-20181126Z-afd6ec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        