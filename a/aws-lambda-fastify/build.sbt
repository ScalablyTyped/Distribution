organization := "org.scalablytyped"
name := "aws-lambda-fastify"
version := "1.4-dt-20211202Z-cd3ddb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-8684db",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-7f4c1c",
  "org.scalablytyped" %%% "fastify" % "4.9.2-b21735",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-bff41b",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-661a25",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-974379",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-c4cdab",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "pino" % "8.7.0-86695b",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-b3b936",
  "org.scalablytyped" %%% "re2" % "1.17.7-7aac79",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-5a7802",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
