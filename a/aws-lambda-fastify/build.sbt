organization := "org.scalablytyped"
name := "aws-lambda-fastify"
version := "1.4-dt-20211202Z-8d0568"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-b44f7d",
  "org.scalablytyped" %%% "buffer" % "6.0.3-61ce95",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-3b66bb",
  "org.scalablytyped" %%% "fastify" % "4.9.2-aaa09a",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-888c52",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-aaa9d0",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-cf9099",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-e42cb7",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-32445d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "pino" % "8.7.0-6401a9",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-9f97c5",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-f57a6f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
