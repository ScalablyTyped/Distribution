organization := "com.scalablytyped"
name := "app-builder-lib"
version := "20.31.2-31a111"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "7zip-bin" % "4.1.0-19bc87",
  "com.scalablytyped" %%% "ajv" % "6.5.4-db8cdc",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "app-builder-bin" % "2.3.0-608fd3",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.6-674cc9",
  "com.scalablytyped" %%% "builder-util" % "8.0.0-ae7dd9",
  "com.scalablytyped" %%% "builder-util-runtime" % "6.1.0-aa87fd",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20181102Z-7de560",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-94743d",
  "com.scalablytyped" %%% "dotenv-expand" % "4.2.0-23b06b",
  "com.scalablytyped" %%% "ejs" % "2.6-dt-20181102Z-915a6b",
  "com.scalablytyped" %%% "electron-osx-sign" % "0.4.11-b8c1fc",
  "com.scalablytyped" %%% "electron-publish" % "20.31.2-a04c3e",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dcdec4",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20181102Z-49c518",
  "com.scalablytyped" %%% "fs-extra-p" % "7.0.0-69a5d1",
  "com.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181102Z-658583",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20181102Z-a29095",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20181102Z-0a1057",
  "com.scalablytyped" %%% "json5" % "0.0-unknown-dt-20181102Z-cdc398",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-b52ec8",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20181102Z-16ee55",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20181102Z-a9f008",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181102Z-d86e2d",
  "com.scalablytyped" %%% "read-config-file" % "3.1.3-136c29",
  "com.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20181102Z-301ed5",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20181102Z-e57b8b",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20181102Z-92c73a",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20181102Z-cef98d",
  "com.scalablytyped" %%% "stat-mode" % "0.2-dt-20181102Z-0d4ec5",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "temp-file" % "3.1.3-94f154",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-e7a1dc",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20181102Z-5c226c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        