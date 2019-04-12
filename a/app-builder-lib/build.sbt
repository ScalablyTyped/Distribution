organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.39.0-a3bc2e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-2393db",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-3a9366",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-55a535",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-a2575a",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-b8507a",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20190322Z-91ef7c",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-c7bb73",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-d02394",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-2916f6",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-01c4b5",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-2c4ad0",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d1d8d8",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-430384",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-72e802",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-9b420a",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-f916a4",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190402Z-168e26",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20190322Z-f9fe84",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-eeaaa8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-41a127",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-53c0a0",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "read-config-file" % "3.2.2-f40af2",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20190322Z-189ab8",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-4d289d",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-d9dc5d",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-eadfcf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-eb7c0d",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20190322Z-ff2724")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        