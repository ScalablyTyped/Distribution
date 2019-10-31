organization := "org.scalablytyped"
name := "actions-on-google"
version := "2.12.0-7e6edd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20191025Z-62553d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-912347",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-183255",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-3d3404",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-900bce",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-04f31e",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-7333f7",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-d37b67",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-1da488",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6a27ff",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        