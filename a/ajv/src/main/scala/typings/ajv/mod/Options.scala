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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  
  var addUsedSchema: js.UndefOr[Boolean] = js.native
  
  var allErrors: js.UndefOr[Boolean] = js.native
  
  var async: js.UndefOr[Boolean | String] = js.native
  
  var cache: js.UndefOr[js.Object] = js.native
  
  var coerceTypes: js.UndefOr[Boolean | array] = js.native
  
  var errorDataPath: js.UndefOr[String] = js.native
  
  var extendRefs: js.UndefOr[`true` | ignore | fail] = js.native
  
  var format: js.UndefOr[`false` | String] = js.native
  
  var formats: js.UndefOr[js.Object] = js.native
  
  var inlineRefs: js.UndefOr[Boolean | Double] = js.native
  
  var jsonPointers: js.UndefOr[Boolean] = js.native
  
  var keywords: js.UndefOr[js.Object] = js.native
  
  var loadSchema: js.UndefOr[
    js.Function2[
      /* uri */ String, 
      /* cb */ js.UndefOr[js.Function2[/* err */ Error, /* schema */ js.Object, Unit]], 
      js.Thenable[js.Object | Boolean]
    ]
  ] = js.native
  
  var logger: js.UndefOr[CustomLogger | `false`] = js.native
  
  var loopRequired: js.UndefOr[Double] = js.native
  
  var messages: js.UndefOr[Boolean] = js.native
  
  var meta: js.UndefOr[Boolean | js.Object] = js.native
  
  var missingRefs: js.UndefOr[`true` | ignore | fail] = js.native
  
  var multipleOfPrecision: js.UndefOr[Boolean | Double] = js.native
  
  var nullable: js.UndefOr[Boolean] = js.native
  
  var ownProperties: js.UndefOr[Boolean] = js.native
  
  var passContext: js.UndefOr[Boolean] = js.native
  
  var processCode: js.UndefOr[js.Function2[/* code */ String, /* schema */ js.Object, String]] = js.native
  
  var removeAdditional: js.UndefOr[Boolean | all | failing] = js.native
  
  var schemaId: js.UndefOr[$id | id | auto] = js.native
  
  var schemas: js.UndefOr[js.Array[js.Object] | js.Object] = js.native
  
  var serialize: js.UndefOr[(js.Function1[/* schema */ js.Object | Boolean, _]) | `false`] = js.native
  
  var sourceCode: js.UndefOr[Boolean] = js.native
  
  var strictDefaults: js.UndefOr[Boolean | log] = js.native
  
  var strictKeywords: js.UndefOr[Boolean | log] = js.native
  
  var strictNumbers: js.UndefOr[Boolean] = js.native
  
  var transpile: js.UndefOr[String | (js.Function1[/* code */ String, String])] = js.native
  
  var unicode: js.UndefOr[Boolean] = js.native
  
  var uniqueItems: js.UndefOr[Boolean] = js.native
  
  var unknownFormats: js.UndefOr[`true` | js.Array[String] | ignore] = js.native
  
  var useDefaults: js.UndefOr[Boolean | empty | shared] = js.native
  
  var validateSchema: js.UndefOr[Boolean | log] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    @scala.inline
    def setAddUsedSchema(value: Boolean): Self = StObject.set(x, "addUsedSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUsedSchemaUndefined: Self = StObject.set(x, "addUsedSchema", js.undefined)
    
    @scala.inline
    def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean | String): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCache(value: js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCoerceTypes(value: Boolean | array): Self = StObject.set(x, "coerceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerceTypesUndefined: Self = StObject.set(x, "coerceTypes", js.undefined)
    
    @scala.inline
    def setErrorDataPath(value: String): Self = StObject.set(x, "errorDataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDataPathUndefined: Self = StObject.set(x, "errorDataPath", js.undefined)
    
    @scala.inline
    def setExtendRefs(value: `true` | ignore | fail): Self = StObject.set(x, "extendRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendRefsUndefined: Self = StObject.set(x, "extendRefs", js.undefined)
    
    @scala.inline
    def setFormat(value: `false` | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setInlineRefs(value: Boolean | Double): Self = StObject.set(x, "inlineRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineRefsUndefined: Self = StObject.set(x, "inlineRefs", js.undefined)
    
    @scala.inline
    def setJsonPointers(value: Boolean): Self = StObject.set(x, "jsonPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPointersUndefined: Self = StObject.set(x, "jsonPointers", js.undefined)
    
    @scala.inline
    def setKeywords(value: js.Object): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLoadSchema(
      value: (/* uri */ String, /* cb */ js.UndefOr[js.Function2[/* err */ Error, /* schema */ js.Object, Unit]]) => js.Thenable[js.Object | Boolean]
    ): Self = StObject.set(x, "loadSchema", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadSchemaUndefined: Self = StObject.set(x, "loadSchema", js.undefined)
    
    @scala.inline
    def setLogger(value: CustomLogger | `false`): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setLoopRequired(value: Double): Self = StObject.set(x, "loopRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopRequiredUndefined: Self = StObject.set(x, "loopRequired", js.undefined)
    
    @scala.inline
    def setMessages(value: Boolean): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMeta(value: Boolean | js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setMissingRefs(value: `true` | ignore | fail): Self = StObject.set(x, "missingRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingRefsUndefined: Self = StObject.set(x, "missingRefs", js.undefined)
    
    @scala.inline
    def setMultipleOfPrecision(value: Boolean | Double): Self = StObject.set(x, "multipleOfPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleOfPrecisionUndefined: Self = StObject.set(x, "multipleOfPrecision", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
    
    @scala.inline
    def setPassContext(value: Boolean): Self = StObject.set(x, "passContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassContextUndefined: Self = StObject.set(x, "passContext", js.undefined)
    
    @scala.inline
    def setProcessCode(value: (/* code */ String, /* schema */ js.Object) => String): Self = StObject.set(x, "processCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessCodeUndefined: Self = StObject.set(x, "processCode", js.undefined)
    
    @scala.inline
    def setRemoveAdditional(value: Boolean | all | failing): Self = StObject.set(x, "removeAdditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAdditionalUndefined: Self = StObject.set(x, "removeAdditional", js.undefined)
    
    @scala.inline
    def setSchemaId(value: $id | id | auto): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    
    @scala.inline
    def setSchemas(value: js.Array[js.Object] | js.Object): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: js.Object*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setSerialize(value: (js.Function1[/* schema */ js.Object | Boolean, _]) | `false`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeFunction1(value: /* schema */ js.Object | Boolean => _): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    @scala.inline
    def setSourceCode(value: Boolean): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeUndefined: Self = StObject.set(x, "sourceCode", js.undefined)
    
    @scala.inline
    def setStrictDefaults(value: Boolean | log): Self = StObject.set(x, "strictDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictDefaultsUndefined: Self = StObject.set(x, "strictDefaults", js.undefined)
    
    @scala.inline
    def setStrictKeywords(value: Boolean | log): Self = StObject.set(x, "strictKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictKeywordsUndefined: Self = StObject.set(x, "strictKeywords", js.undefined)
    
    @scala.inline
    def setStrictNumbers(value: Boolean): Self = StObject.set(x, "strictNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictNumbersUndefined: Self = StObject.set(x, "strictNumbers", js.undefined)
    
    @scala.inline
    def setTranspile(value: String | (js.Function1[/* code */ String, String])): Self = StObject.set(x, "transpile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranspileFunction1(value: /* code */ String => String): Self = StObject.set(x, "transpile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranspileUndefined: Self = StObject.set(x, "transpile", js.undefined)
    
    @scala.inline
    def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    
    @scala.inline
    def setUnknownFormats(value: `true` | js.Array[String] | ignore): Self = StObject.set(x, "unknownFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownFormatsUndefined: Self = StObject.set(x, "unknownFormats", js.undefined)
    
    @scala.inline
    def setUnknownFormatsVarargs(value: String*): Self = StObject.set(x, "unknownFormats", js.Array(value :_*))
    
    @scala.inline
    def setUseDefaults(value: Boolean | empty | shared): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    
    @scala.inline
    def setValidateSchema(value: Boolean | log): Self = StObject.set(x, "validateSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateSchemaUndefined: Self = StObject.set(x, "validateSchema", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
