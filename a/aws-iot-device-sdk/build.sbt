organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.2.0-dt-20190322Z-de961f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "mqtt" % "3.0.0-1a7a29",
  "org.scalablytyped" %%% "mqtt-packet" % "6.1.2-bebb2c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-4f05bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        