package typings.ajv.distTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.ajv.ajvBooleans.`true`
import typings.ajv.anon.SchemaType
import typings.ajv.compileMod.SchemaCxt
import typings.ajv.compileMod.SchemaObjCxt
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddedFormat = `true` | js.RegExp | FormatValidator[String] | (FormatDefinition[Double | String]) | (AsyncFormatDefinition[Double | String])

type AddedKeywordDefinition = KeywordDefinition & SchemaType

type AnySchema = Schema | AsyncSchema

type AsyncFormatValidator[T /* <: String | Double */] = js.Function1[/* data */ T, js.Promise[Boolean]]

type CompileKeywordFunc = js.Function3[
/* schema */ Any, 
/* parentSchema */ AnySchemaObject, 
/* it */ SchemaObjCxt, 
DataValidateFunction]

type ErrorNoParams[K /* <: String */, S] = ErrorObject[K, Record[String, scala.Nothing], S]

type EvaluatedItems = Double | `true`

type EvaluatedProperties = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in string ]:? true}
  */ typings.ajv.ajvStrings.EvaluatedProperties & TopLevel[Any]) | `true`

type Format = AddedFormat | String

type FormatCompare[T /* <: String | Double */] = js.Function2[/* data1 */ T, /* data2 */ T, js.UndefOr[Double]]

type FormatValidator[T /* <: String | Double */] = js.Function1[/* data */ T, Boolean]

type KeywordCxtParams = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in string ]:? ajv.ajv/dist/compile/codegen/code.Code | string | number}
  */ typings.ajv.ajvStrings.KeywordCxtParams & TopLevel[Any]

type MacroKeywordFunc = js.Function3[/* schema */ Any, /* parentSchema */ AnySchemaObject, /* it */ SchemaCxt, AnySchema]

type Schema = SchemaObject | Boolean

type SchemaMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Key in string ]:? ajv.ajv/dist/types.AnySchema}
  */ typings.ajv.ajvStrings.SchemaMap & TopLevel[Any]

type Vocabulary = js.Array[KeywordDefinition | String]
