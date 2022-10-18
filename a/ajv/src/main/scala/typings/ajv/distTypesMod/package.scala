package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`true`
import typings.ajv.anon.SchemaType
import typings.ajv.distCompileMod.SchemaCxt
import typings.ajv.distCompileMod.SchemaObjCxt
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

type EvaluatedProperties = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in string ]:? true} */ js.Any) | `true`

type Format = AddedFormat | String

type FormatCompare[T /* <: String | Double */] = js.Function2[/* data1 */ T, /* data2 */ T, js.UndefOr[Double]]

type FormatValidator[T /* <: String | Double */] = js.Function1[/* data */ T, Boolean]

type MacroKeywordFunc = js.Function3[/* schema */ Any, /* parentSchema */ AnySchemaObject, /* it */ SchemaCxt, AnySchema]

type Schema = SchemaObject | Boolean

type Vocabulary = js.Array[KeywordDefinition | String]
