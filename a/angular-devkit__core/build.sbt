organization := "org.scalablytyped"
name := "angular-devkit__core"
version := "14.2.6-555c59"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-18e12a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d48537",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
