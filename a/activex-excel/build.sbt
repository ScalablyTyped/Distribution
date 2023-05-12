organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20230328Z-da5249"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20230328Z-bbbafb",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20220705Z-ca77b3",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20230328Z-d2c1ab",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20230328Z-4e9be9",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20230328Z-9a0dd5",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20230328Z-6e882b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
