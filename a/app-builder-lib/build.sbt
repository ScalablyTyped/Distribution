organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.3-3585b6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-78a6d7",
  "org.scalablytyped" %%% "ajv" % "6.6.1-529687",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-1456ae",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-460360",
  "org.scalablytyped" %%% "builder-util" % "9.6.0-87252e",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-6396c4",
  "org.scalablytyped" %%% "chalk" % "2.4.1-de9d5d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-ffd3eb",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-71d1a2",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-fdd8a7",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-9100af",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-5c622c",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-931ddf",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b17da",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-0a22d4",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-4e7716",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-0b071e",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181104Z-d50b25",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-c063b2",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-0e1a20",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-24c2f9",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-82e4de",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-81565f",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-508edf",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-6a1d55",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-b99860",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180910Z-9b2213",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-edb89a",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-3d192b",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-15484d",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-fd9d90",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ca563f",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-61c1cf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        