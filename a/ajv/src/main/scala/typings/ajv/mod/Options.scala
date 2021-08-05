package typings.ajv.mod

import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvBooleans.`true`
import typings.ajv.ajvStrings.$id
import typings.ajv.ajvStrings.all
import typings.ajv.ajvStrings.array
import typings.ajv.ajvStrings.auto
import typings.ajv.ajvStrings.empty
import typings.ajv.ajvStrings.fail
import typings.ajv.ajvStrings.failing
import typings.ajv.ajvStrings.id
import typings.ajv.ajvStrings.ignore
import typings.ajv.ajvStrings.log
import typings.ajv.ajvStrings.shared
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.undefined
  
  var addUsedSchema: js.UndefOr[Boolean] = js.undefined
  
  var allErrors: js.UndefOr[Boolean] = js.undefined
  
  var async: js.UndefOr[Boolean | String] = js.undefined
  
  var cache: js.UndefOr[js.Object] = js.undefined
  
  var coerceTypes: js.UndefOr[Boolean | array] = js.undefined
  
  var errorDataPath: js.UndefOr[String] = js.undefined
  
  var extendRefs: js.UndefOr[`true` | ignore | fail] = js.undefined
  
  var format: js.UndefOr[`false` | String] = js.undefined
  
  var formats: js.UndefOr[js.Object] = js.undefined
  
  var inlineRefs: js.UndefOr[Boolean | Double] = js.undefined
  
  var jsonPointers: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[js.Object] = js.undefined
  
  var loadSchema: js.UndefOr[
    js.Function2[
      /* uri */ String, 
      /* cb */ js.UndefOr[js.Function2[/* err */ Error, /* schema */ js.Object, Unit]], 
      js.Thenable[js.Object | Boolean]
    ]
  ] = js.undefined
  
  var logger: js.UndefOr[CustomLogger | `false`] = js.undefined
  
  var loopRequired: js.UndefOr[Double] = js.undefined
  
  var messages: js.UndefOr[Boolean] = js.undefined
  
  var meta: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var missingRefs: js.UndefOr[`true` | ignore | fail] = js.undefined
  
  var multipleOfPrecision: js.UndefOr[Boolean | Double] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var ownProperties: js.UndefOr[Boolean] = js.undefined
  
  var passContext: js.UndefOr[Boolean] = js.undefined
  
  var processCode: js.UndefOr[js.Function2[/* code */ String, /* schema */ js.Object, String]] = js.undefined
  
  var removeAdditional: js.UndefOr[Boolean | all | failing] = js.undefined
  
  var schemaId: js.UndefOr[$id | id | auto] = js.undefined
  
  var schemas: js.UndefOr[js.Array[js.Object] | js.Object] = js.undefined
  
  var serialize: js.UndefOr[(js.Function1[/* schema */ js.Object | Boolean, js.Any]) | `false`] = js.undefined
  
  var sourceCode: js.UndefOr[Boolean] = js.undefined
  
  var strictDefaults: js.UndefOr[Boolean | log] = js.undefined
  
  var strictKeywords: js.UndefOr[Boolean | log] = js.undefined
  
  var strictNumbers: js.UndefOr[Boolean] = js.undefined
  
  var transpile: js.UndefOr[String | (js.Function1[/* code */ String, String])] = js.undefined
  
  var unicode: js.UndefOr[Boolean] = js.undefined
  
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
  
  var unknownFormats: js.UndefOr[`true` | js.Array[String] | ignore] = js.undefined
  
  var useDefaults: js.UndefOr[Boolean | empty | shared] = js.undefined
  
  var validateSchema: js.UndefOr[Boolean | log] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    inline def setAddUsedSchema(value: Boolean): Self = StObject.set(x, "addUsedSchema", value.asInstanceOf[js.Any])
    
    inline def setAddUsedSchemaUndefined: Self = StObject.set(x, "addUsedSchema", js.undefined)
    
    inline def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
    
    inline def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
    
    inline def setAsync(value: Boolean | String): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCache(value: js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCoerceTypes(value: Boolean | array): Self = StObject.set(x, "coerceTypes", value.asInstanceOf[js.Any])
    
    inline def setCoerceTypesUndefined: Self = StObject.set(x, "coerceTypes", js.undefined)
    
    inline def setErrorDataPath(value: String): Self = StObject.set(x, "errorDataPath", value.asInstanceOf[js.Any])
    
    inline def setErrorDataPathUndefined: Self = StObject.set(x, "errorDataPath", js.undefined)
    
    inline def setExtendRefs(value: `true` | ignore | fail): Self = StObject.set(x, "extendRefs", value.asInstanceOf[js.Any])
    
    inline def setExtendRefsUndefined: Self = StObject.set(x, "extendRefs", js.undefined)
    
    inline def setFormat(value: `false` | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setInlineRefs(value: Boolean | Double): Self = StObject.set(x, "inlineRefs", value.asInstanceOf[js.Any])
    
    inline def setInlineRefsUndefined: Self = StObject.set(x, "inlineRefs", js.undefined)
    
    inline def setJsonPointers(value: Boolean): Self = StObject.set(x, "jsonPointers", value.asInstanceOf[js.Any])
    
    inline def setJsonPointersUndefined: Self = StObject.set(x, "jsonPointers", js.undefined)
    
    inline def setKeywords(value: js.Object): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLoadSchema(
      value: (/* uri */ String, /* cb */ js.UndefOr[js.Function2[/* err */ Error, /* schema */ js.Object, Unit]]) => js.Thenable[js.Object | Boolean]
    ): Self = StObject.set(x, "loadSchema", js.Any.fromFunction2(value))
    
    inline def setLoadSchemaUndefined: Self = StObject.set(x, "loadSchema", js.undefined)
    
    inline def setLogger(value: CustomLogger | `false`): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setLoopRequired(value: Double): Self = StObject.set(x, "loopRequired", value.asInstanceOf[js.Any])
    
    inline def setLoopRequiredUndefined: Self = StObject.set(x, "loopRequired", js.undefined)
    
    inline def setMessages(value: Boolean): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMeta(value: Boolean | js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMissingRefs(value: `true` | ignore | fail): Self = StObject.set(x, "missingRefs", value.asInstanceOf[js.Any])
    
    inline def setMissingRefsUndefined: Self = StObject.set(x, "missingRefs", js.undefined)
    
    inline def setMultipleOfPrecision(value: Boolean | Double): Self = StObject.set(x, "multipleOfPrecision", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfPrecisionUndefined: Self = StObject.set(x, "multipleOfPrecision", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
    
    inline def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
    
    inline def setPassContext(value: Boolean): Self = StObject.set(x, "passContext", value.asInstanceOf[js.Any])
    
    inline def setPassContextUndefined: Self = StObject.set(x, "passContext", js.undefined)
    
    inline def setProcessCode(value: (/* code */ String, /* schema */ js.Object) => String): Self = StObject.set(x, "processCode", js.Any.fromFunction2(value))
    
    inline def setProcessCodeUndefined: Self = StObject.set(x, "processCode", js.undefined)
    
    inline def setRemoveAdditional(value: Boolean | all | failing): Self = StObject.set(x, "removeAdditional", value.asInstanceOf[js.Any])
    
    inline def setRemoveAdditionalUndefined: Self = StObject.set(x, "removeAdditional", js.undefined)
    
    inline def setSchemaId(value: $id | id | auto): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    
    inline def setSchemas(value: js.Array[js.Object] | js.Object): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: js.Object*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    inline def setSerialize(value: (js.Function1[/* schema */ js.Object | Boolean, js.Any]) | `false`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunction1(value: /* schema */ js.Object | Boolean => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    inline def setSourceCode(value: Boolean): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeUndefined: Self = StObject.set(x, "sourceCode", js.undefined)
    
    inline def setStrictDefaults(value: Boolean | log): Self = StObject.set(x, "strictDefaults", value.asInstanceOf[js.Any])
    
    inline def setStrictDefaultsUndefined: Self = StObject.set(x, "strictDefaults", js.undefined)
    
    inline def setStrictKeywords(value: Boolean | log): Self = StObject.set(x, "strictKeywords", value.asInstanceOf[js.Any])
    
    inline def setStrictKeywordsUndefined: Self = StObject.set(x, "strictKeywords", js.undefined)
    
    inline def setStrictNumbers(value: Boolean): Self = StObject.set(x, "strictNumbers", value.asInstanceOf[js.Any])
    
    inline def setStrictNumbersUndefined: Self = StObject.set(x, "strictNumbers", js.undefined)
    
    inline def setTranspile(value: String | (js.Function1[/* code */ String, String])): Self = StObject.set(x, "transpile", value.asInstanceOf[js.Any])
    
    inline def setTranspileFunction1(value: /* code */ String => String): Self = StObject.set(x, "transpile", js.Any.fromFunction1(value))
    
    inline def setTranspileUndefined: Self = StObject.set(x, "transpile", js.undefined)
    
    inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    
    inline def setUnknownFormats(value: `true` | js.Array[String] | ignore): Self = StObject.set(x, "unknownFormats", value.asInstanceOf[js.Any])
    
    inline def setUnknownFormatsUndefined: Self = StObject.set(x, "unknownFormats", js.undefined)
    
    inline def setUnknownFormatsVarargs(value: String*): Self = StObject.set(x, "unknownFormats", js.Array(value :_*))
    
    inline def setUseDefaults(value: Boolean | empty | shared): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    
    inline def setValidateSchema(value: Boolean | log): Self = StObject.set(x, "validateSchema", value.asInstanceOf[js.Any])
    
    inline def setValidateSchemaUndefined: Self = StObject.set(x, "validateSchema", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
