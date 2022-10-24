organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20220705Z-5aa3ef"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20220705Z-8a9f82",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20220705Z-8dc27f",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20220705Z-9c7b1f",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-b0f446",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
