organization := "com.scalablytyped"
name := "angular-signalr-hub"
version := "v1.5.0-dt-20180910Z-178c86"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-d10678",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-c6ff09",
  "com.scalablytyped" %%% "signalr" % "2.2.0-dt-20180910Z-5a9394",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-99baa3",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        