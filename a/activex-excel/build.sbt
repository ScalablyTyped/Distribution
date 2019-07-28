organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-96dc18"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-a863b4",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-867cc0",
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
        