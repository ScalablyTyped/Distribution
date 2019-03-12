organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20190213Z-e10fbe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-d6ec7c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-a04435",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-c37e96",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-82b477",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-656821",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-fb7de9",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        