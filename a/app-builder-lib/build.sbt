organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.5-b3f181"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-3f59da",
  "org.scalablytyped" %%% "ajv" % "6.7.0-9e8624",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-838f48",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-053f79",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-9114ea",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-a91ce0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-a95e4d",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-48b9e5",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-f94605",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-54a509",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-c69b54",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-b0239a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-57e227",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-585a5f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-4a413b",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-3622ed",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-0ebd09",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-568b5b",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6e1cbe",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-edb1e0",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-88a052",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-94b6ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-de7b50",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-ba2dd2",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-82f2e3",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-b75463",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-bc1cab",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-fdcda0",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-0f4428",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-14e472",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-408efe",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-df3f4a",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-a98a90")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        