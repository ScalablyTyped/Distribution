organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.2-c08512"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-94bfa2",
  "org.scalablytyped" %%% "ajv" % "6.6.1-c0d3c4",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-57107f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-edd0bc",
  "org.scalablytyped" %%% "builder-util" % "9.6.0-191b5f",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.0.2-0a1039",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-a698bb",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-d1e013",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-01c745",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-4b4913",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-335a2b",
  "org.scalablytyped" %%% "electron-publish" % "20.38.2-aea1c0",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-3455dd",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2e2a60",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-cc8eb7",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181104Z-690dd2",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-731c00",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-948572",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-49ddfd",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-c2b0d7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-fb9b73",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-112dcf",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-d2b330",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-21b862",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180910Z-77b12c",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-fcb303",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-c36488",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-762bad",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-ab37b2",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-25b105",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-324fb4",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-54c897")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        