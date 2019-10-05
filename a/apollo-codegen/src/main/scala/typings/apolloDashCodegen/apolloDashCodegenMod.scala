package typings.apolloDashCodegen

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashCodegen.apolloDashCodegenMod.TargetType
import typings.graphql.utilitiesSchemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-codegen", JSImport.Namespace)
@js.native
object apolloDashCodegenMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.apolloDashCodegen.apolloDashCodegenStrings.json
    - typings.apolloDashCodegen.apolloDashCodegenStrings.swift
    - typings.apolloDashCodegen.apolloDashCodegenStrings.`ts-legacy`
    - typings.apolloDashCodegen.apolloDashCodegenStrings.`typescript-legacy`
    - typings.apolloDashCodegen.apolloDashCodegenStrings.`flow-legacy`
    - typings.apolloDashCodegen.apolloDashCodegenStrings.SCALA
    - typings.apolloDashCodegen.apolloDashCodegenStrings.flow
    - typings.apolloDashCodegen.apolloDashCodegenStrings.typescript
    - typings.apolloDashCodegen.apolloDashCodegenStrings.ts
  */
  trait TargetType extends js.Object
  
  def downloadSchema(
    url: String,
    outputPath: String,
    additionalHeaders: StringDictionary[String],
    insecure: Boolean,
    method: String
  ): js.Promise[Unit] = js.native
  def generate(
    inputPaths: js.Array[String],
    schemaPath: String,
    outputPath: String,
    only: String,
    target: TargetType,
    tagName: String,
    projectName: String,
    options: Anon_AddTypename
  ): Unit = js.native
  def introspectSchema(schemaPath: String, outputPath: String): js.Promise[Unit] = js.native
  def printSchema(schemaPath: String, outputPath: String): js.Promise[Unit] = js.native
  def printSchema(schemaPath: String, outputPath: String, options: Options): js.Promise[Unit] = js.native
}

