organization := "com.scalablytyped"
name := "app-builder-lib"
version := "20.28.4-419f04"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "7zip-bin" % "4.0.2-784e37",
  "com.scalablytyped" %%% "ajv" % "6.5.4-9e8709",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "app-builder-bin" % "2.1.2-c7ff6d",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.5-f4447e",
  "com.scalablytyped" %%% "builder-util" % "6.1.3-faf653",
  "com.scalablytyped" %%% "builder-util-runtime" % "4.4.1-f52696",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-0b944c",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-716235",
  "com.scalablytyped" %%% "dotenv-expand" % "4.2.0-e7e7ab",
  "com.scalablytyped" %%% "ejs" % "2.6-dt-20180910Z-9bb5f1",
  "com.scalablytyped" %%% "electron-osx-sign" % "0.4.10-f9e09f",
  "com.scalablytyped" %%% "electron-publish" % "20.28.3-2dae2d",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ef0253",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-61412b",
  "com.scalablytyped" %%% "fs-extra-p" % "4.6.1-a77bad",
  "com.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181104Z-b57e8d",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-bb32bb",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-fd3121",
  "com.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-6e2bd3",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-501d39",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-7bccfc",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-8ec4ce",
  "com.scalablytyped" %%% "read-config-file" % "3.1.2-5f66de",
  "com.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180910Z-bbcbe3",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-0972d1",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-eae856",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-c99a16",
  "com.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-04c019",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "temp-file" % "3.1.3-04c230",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-32727b",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-7c80c2",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        