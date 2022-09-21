package typings.ajv

import typings.ajv.codeMod.Code
import typings.ajv.codegenMod.CodeGen
import typings.ajv.codegenMod.Name
import typings.ajv.compileMod.SchemaCxt
import typings.ajv.distTypesMod.SchemaMap
import typings.ajv.validateMod.KeywordCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vocabulariesCodeMod {
  
  @JSImport("ajv/dist/vocabularies/code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allSchemaProperties(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSchemaProperties")().asInstanceOf[js.Array[String]]
  inline def allSchemaProperties(schemaMap: SchemaMap): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSchemaProperties")(schemaMap.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def callValidateCode(hasSchemaCodeDataHasGenTopSchemaRefSchemaPathErrorPathIt: KeywordCxt, func: Code, context: Code): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("callValidateCode")(hasSchemaCodeDataHasGenTopSchemaRefSchemaPathErrorPathIt.asInstanceOf[js.Any], func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def callValidateCode(
    hasSchemaCodeDataHasGenTopSchemaRefSchemaPathErrorPathIt: KeywordCxt,
    func: Code,
    context: Code,
    passSchema: Boolean
  ): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("callValidateCode")(hasSchemaCodeDataHasGenTopSchemaRefSchemaPathErrorPathIt.asInstanceOf[js.Any], func.asInstanceOf[js.Any], context.asInstanceOf[js.Any], passSchema.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def checkMissingProp(hasGenDataHasOpts: KeywordCxt, properties: js.Array[String], missing: Name): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMissingProp")(hasGenDataHasOpts.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], missing.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def checkReportMissingProp(cxt: KeywordCxt, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkReportMissingProp")(cxt.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasPropFunc(gen: CodeGen): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPropFunc")(gen.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  inline def isOwnProperty(gen: CodeGen, data: Name, property: String): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("isOwnProperty")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def isOwnProperty(gen: CodeGen, data: Name, property: Name): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("isOwnProperty")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def noPropertyInData(gen: CodeGen, data: Name, property: String): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("noPropertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def noPropertyInData(gen: CodeGen, data: Name, property: String, ownProperties: Boolean): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("noPropertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any], ownProperties.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def noPropertyInData(gen: CodeGen, data: Name, property: Name): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("noPropertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def noPropertyInData(gen: CodeGen, data: Name, property: Name, ownProperties: Boolean): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("noPropertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any], ownProperties.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def propertyInData(gen: CodeGen, data: Name, property: String): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def propertyInData(gen: CodeGen, data: Name, property: String, ownProperties: Boolean): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any], ownProperties.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def propertyInData(gen: CodeGen, data: Name, property: Name): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def propertyInData(gen: CodeGen, data: Name, property: Name, ownProperties: Boolean): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyInData")(gen.asInstanceOf[js.Any], data.asInstanceOf[js.Any], property.asInstanceOf[js.Any], ownProperties.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def reportMissingProp(cxt: KeywordCxt, missing: Name): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportMissingProp")(cxt.asInstanceOf[js.Any], missing.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def schemaProperties(it: SchemaCxt, schemaMap: SchemaMap): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaProperties")(it.asInstanceOf[js.Any], schemaMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def usePattern(hasGenHasOpts: KeywordCxt, pattern: String): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("usePattern")(hasGenHasOpts.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  inline def validateArray(cxt: KeywordCxt): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("validateArray")(cxt.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  inline def validateUnion(cxt: KeywordCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateUnion")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
