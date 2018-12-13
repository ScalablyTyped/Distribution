organization := "org.scalablytyped"
name := "apollographql__apollo-tools"
version := "0.2.9-0cfba3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-e87ba5",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2ab9a3",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-4dc81b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        