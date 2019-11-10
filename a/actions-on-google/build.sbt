organization := "org.scalablytyped"
name := "actions-on-google"
version := "2.12.0-4c748f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20191108Z-3a84a5",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-675d96",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1971cc",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d67e76",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-df008a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-cdc4d1",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-c2507d",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-e1d04c",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-10afe6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1c7f66",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        