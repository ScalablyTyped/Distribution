organization := "com.scalablytyped"
name := "app-builder-lib"
version := "20.38.1-b27436"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "7zip-bin" % "4.1.0-7ec5a8",
  "com.scalablytyped" %%% "ajv" % "6.6.1-b44699",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "app-builder-bin" % "2.5.5-4e9470",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.6-98debd",
  "com.scalablytyped" %%% "builder-util" % "9.5.0-fd078a",
  "com.scalablytyped" %%% "builder-util-runtime" % "8.0.2-b49704",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-b787cf",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-103725",
  "com.scalablytyped" %%% "dotenv-expand" % "4.2.0-daa748",
  "com.scalablytyped" %%% "ejs" % "2.6-dt-20180910Z-0039e8",
  "com.scalablytyped" %%% "electron-osx-sign" % "0.4.11-c75860",
  "com.scalablytyped" %%% "electron-publish" % "20.38.0-4c0c85",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-892599",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-748b3b",
  "com.scalablytyped" %%% "fs-extra-p" % "7.0.0-c19546",
  "com.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181104Z-66e73c",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-032e5f",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-1bb86e",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-d82200",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-ebbee6",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-8dce11",
  "com.scalablytyped" %%% "read-config-file" % "3.2.0-0d075c",
  "com.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180910Z-2d0bb1",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-e0b0d4",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b64c1e",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-56237b",
  "com.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-c178cf",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "temp-file" % "3.3.2-dda542",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-56439b",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-89312f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        