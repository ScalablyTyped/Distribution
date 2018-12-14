organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.38.3-0feaf2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-bc7118",
  "org.scalablytyped" %%% "ajv" % "6.6.1-5904fe",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-db1a71",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-28c29e",
  "org.scalablytyped" %%% "builder-util" % "9.6.0-88184d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-67427d",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-a2fdef",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-897c8b",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-a42b6d",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-696e57",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-de3e62",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-6e5692",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-55b1a8",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-b30a1d",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181104Z-ce06b1",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-3a9571",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-d92217",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-06d10e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-d030b8",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-ed550e",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-06df8d",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-aa9bf9",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180910Z-ed9852",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-d9abb6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-8ca982",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-5d16f0",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-0b63f6",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-ee6f2f",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-535255",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-3cf58d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        