organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20190213Z-45aa7c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-758ec2",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-ccc899",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-163c42",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-12882f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        