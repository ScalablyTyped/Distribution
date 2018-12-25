organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.4-06879d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-ab2090",
  "org.scalablytyped" %%% "ajv" % "6.6.2-95b01f",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-6fdba3",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.1-147f5b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-f8035b",
  "org.scalablytyped" %%% "builder-util" % "9.6.1-da2d8e",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-419978",
  "org.scalablytyped" %%% "chalk" % "2.4.1-44ad3c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-b579a6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-e4927f",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-6e56c9",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-a0d751",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-49f7d0",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-872272",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dc1557",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-904c02",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-9e8f6d",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-af656e",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-b09f46",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-88eb4b",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-67ede6",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-a97803",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-d61f0d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-d891ae",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b6dbcd",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-5fd723",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-eb1f5a",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-052d66",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-a778ce",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-e2fd38",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a75495",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-62cddd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-5f497b",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-74ebff",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-68b43e",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-906edd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        