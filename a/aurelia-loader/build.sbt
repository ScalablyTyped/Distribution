organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.1-0e94c0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-118e23",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-ddd1c8",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-fd2b71",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        