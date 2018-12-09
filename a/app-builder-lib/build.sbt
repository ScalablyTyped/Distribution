organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.2-f19167"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-1e1e38",
  "org.scalablytyped" %%% "ajv" % "6.6.1-a70ce9",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-89620d",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-920ba9",
  "org.scalablytyped" %%% "builder-util" % "9.6.0-c6567e",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.0.2-124a4a",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-50b87a",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-48ad7d",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-0a7334",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-aa3440",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-96441b",
  "org.scalablytyped" %%% "electron-publish" % "20.38.2-de3340",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-f9cead",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-57e2a1",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-872d3d",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181104Z-11d883",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-aa651f",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-190fee",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-018c86",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-63f213",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-18660e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-a0d707",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-71f442",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-0a9ba8",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-f2abe7",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180910Z-a8ee7b",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-c0c18a",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b342e2",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-d1333e",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-821f30",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-f2ff47",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6f00bb",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-f1dc0f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        