organization := "org.scalablytyped"
name := "apollo-client"
version := "2.5.1-f31adb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-4f5a7e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-98b0c6",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-b45dc8",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-b3e7eb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-0198fb",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-ca96a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        