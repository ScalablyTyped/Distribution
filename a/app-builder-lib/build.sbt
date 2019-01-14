organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.4-930b06"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-af3dc6",
  "org.scalablytyped" %%% "ajv" % "6.7.0-b81c67",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.1-c60a57",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-58dc1d",
  "org.scalablytyped" %%% "builder-util" % "9.6.1-5e8d46",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-311dac",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-79a5ba",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-be1c74",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-663bd0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-cec9a8",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-0ba1a3",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-89e934",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-a47544",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-95ed7f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-57e80f",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-d6df7b",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-0dea14",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-06ecaa",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-ef4759",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-58f732",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fcc4b6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-6377b0",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-a29dd6",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-1e0ea5",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-a36a46",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-1e11ee",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-3eb7b5",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6f52c3",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-e778dd",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-73f059",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-8ec67e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ae97ae",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-f4d178")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        