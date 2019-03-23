organization := "org.scalablytyped"
name := "asyncblock"
version := "2.2.12-caedb4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asyncblock-generators" % "2.2.12-88cffb",
  "org.scalablytyped" %%% "esprima" % "4.0-dt-20180501Z-9953d9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-154c1f",
  "org.scalablytyped" %%% "fibers" % "0.0-unknown-dt-20190322Z-0d4e84",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        