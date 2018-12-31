organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.4-286c7e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-4f7da1",
  "org.scalablytyped" %%% "ajv" % "6.6.2-2b33e8",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.1-d18151",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-95ab1e",
  "org.scalablytyped" %%% "builder-util" % "9.6.1-d9688a",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-870d5f",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b06515",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-5ecdf6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-bc860f",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-969de3",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-9c0a3f",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-eb0b64",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-8cb82f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ccba98",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-31009f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-7d565d",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-0657bc",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-af4281",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-43e82c",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-c8a4e4",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-0bc3ab",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-a1e1c0",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b934d4",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-3650a8",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-f7259d",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-96223c",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-dc40c5",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-5afbca",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-5b8a80",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-77ab9d",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-a92d08",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-3ee6a4",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-e9a3f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        