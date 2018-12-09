organization := "org.scalablytyped"
name := "angular-ui-sortable"
version := "0.13-dt-20181027Z-3fe9f8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-beeb4f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-928df5",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20181120Z-cf10eb",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-081654",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        