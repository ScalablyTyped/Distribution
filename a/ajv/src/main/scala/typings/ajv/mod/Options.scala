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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$data(value: Boolean): Self = this.set("$data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$data: Self = this.set("$data", js.undefined)
    
    @scala.inline
    def setAddUsedSchema(value: Boolean): Self = this.set("addUsedSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddUsedSchema: Self = this.set("addUsedSchema", js.undefined)
    
    @scala.inline
    def setAllErrors(value: Boolean): Self = this.set("allErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllErrors: Self = this.set("allErrors", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean | String): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setCache(value: js.Object): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCoerceTypes(value: Boolean | array): Self = this.set("coerceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoerceTypes: Self = this.set("coerceTypes", js.undefined)
    
    @scala.inline
    def setErrorDataPath(value: String): Self = this.set("errorDataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDataPath: Self = this.set("errorDataPath", js.undefined)
    
    @scala.inline
    def setExtendRefs(value: `true` | ignore | fail): Self = this.set("extendRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendRefs: Self = this.set("extendRefs", js.undefined)
    
    @scala.inline
    def setFormat(value: `false` | String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Object): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setInlineRefs(value: Boolean | Double): Self = this.set("inlineRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineRefs: Self = this.set("inlineRefs", js.undefined)
    
    @scala.inline
    def setJsonPointers(value: Boolean): Self = this.set("jsonPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonPointers: Self = this.set("jsonPointers", js.undefined)
    
    @scala.inline
    def setKeywords(value: js.Object): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setLoadSchema(
      value: (/* uri */ String, /* cb */ js.UndefOr[js.Function2[/* err */ Error, /* schema */ js.Object, Unit]]) => js.Thenable[js.Object | Boolean]
    ): Self = this.set("loadSchema", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadSchema: Self = this.set("loadSchema", js.undefined)
    
    @scala.inline
    def setLogger(value: CustomLogger | `false`): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setLoopRequired(value: Double): Self = this.set("loopRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopRequired: Self = this.set("loopRequired", js.undefined)
    
    @scala.inline
    def setMessages(value: Boolean): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMeta(value: Boolean | js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setMissingRefs(value: `true` | ignore | fail): Self = this.set("missingRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingRefs: Self = this.set("missingRefs", js.undefined)
    
    @scala.inline
    def setMultipleOfPrecision(value: Boolean | Double): Self = this.set("multipleOfPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleOfPrecision: Self = this.set("multipleOfPrecision", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setOwnProperties(value: Boolean): Self = this.set("ownProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnProperties: Self = this.set("ownProperties", js.undefined)
    
    @scala.inline
    def setPassContext(value: Boolean): Self = this.set("passContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassContext: Self = this.set("passContext", js.undefined)
    
    @scala.inline
    def setProcessCode(value: (/* code */ String, /* schema */ js.Object) => String): Self = this.set("processCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcessCode: Self = this.set("processCode", js.undefined)
    
    @scala.inline
    def setRemoveAdditional(value: Boolean | all | failing): Self = this.set("removeAdditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAdditional: Self = this.set("removeAdditional", js.undefined)
    
    @scala.inline
    def setSchemaId(value: $id | id | auto): Self = this.set("schemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaId: Self = this.set("schemaId", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: js.Object*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[js.Object] | js.Object): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    
    @scala.inline
    def setSerializeFunction1(value: /* schema */ js.Object | Boolean => _): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: (js.Function1[/* schema */ js.Object | Boolean, _]) | `false`): Self = this.set("serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setSourceCode(value: Boolean): Self = this.set("sourceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCode: Self = this.set("sourceCode", js.undefined)
    
    @scala.inline
    def setStrictDefaults(value: Boolean | log): Self = this.set("strictDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictDefaults: Self = this.set("strictDefaults", js.undefined)
    
    @scala.inline
    def setStrictKeywords(value: Boolean | log): Self = this.set("strictKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictKeywords: Self = this.set("strictKeywords", js.undefined)
    
    @scala.inline
    def setStrictNumbers(value: Boolean): Self = this.set("strictNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictNumbers: Self = this.set("strictNumbers", js.undefined)
    
    @scala.inline
    def setTranspileFunction1(value: /* code */ String => String): Self = this.set("transpile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranspile(value: String | (js.Function1[/* code */ String, String])): Self = this.set("transpile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranspile: Self = this.set("transpile", js.undefined)
    
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
    
    @scala.inline
    def setUnknownFormatsVarargs(value: String*): Self = this.set("unknownFormats", js.Array(value :_*))
    
    @scala.inline
    def setUnknownFormats(value: `true` | js.Array[String] | ignore): Self = this.set("unknownFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownFormats: Self = this.set("unknownFormats", js.undefined)
    
    @scala.inline
    def setUseDefaults(value: Boolean | empty | shared): Self = this.set("useDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaults: Self = this.set("useDefaults", js.undefined)
    
    @scala.inline
    def setValidateSchema(value: Boolean | log): Self = this.set("validateSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateSchema: Self = this.set("validateSchema", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
