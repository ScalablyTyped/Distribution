organization := "org.scalablytyped"
name := "aws-lambda-fastify"
version := "1.4-dt-20211202Z-3cd240"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-e75802",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-be25c9",
  "org.scalablytyped" %%% "fastify" % "4.9.2-a1397c",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-5d3d36",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-49b4b3",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-0f91bb",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-c8403f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "pino" % "8.7.0-20fcc3",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-2ac8c3",
  "org.scalablytyped" %%% "re2" % "1.17.7-9b0ba5",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-bc64c1",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
