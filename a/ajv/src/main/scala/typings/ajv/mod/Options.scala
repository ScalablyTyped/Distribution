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
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  var processCode: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
  var removeAdditional: js.UndefOr[Boolean | all | failing] = js.undefined
  var schemaId: js.UndefOr[$id | id | auto] = js.undefined
  var schemas: js.UndefOr[js.Array[js.Object] | js.Object] = js.undefined
  var serialize: js.UndefOr[(js.Function1[/* schema */ js.Object | Boolean, _]) | `false`] = js.undefined
  var sourceCode: js.UndefOr[Boolean] = js.undefined
  var strictDefaults: js.UndefOr[Boolean | log] = js.undefined
  var strictKeywords: js.UndefOr[Boolean | log] = js.undefined
  var transpile: js.UndefOr[String | (js.Function1[/* code */ String, String])] = js.undefined
  var unicode: js.UndefOr[Boolean] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
  var unknownFormats: js.UndefOr[`true` | js.Array[String] | ignore] = js.undefined
  var useDefaults: js.UndefOr[Boolean | empty | shared] = js.undefined
  var validateSchema: js.UndefOr[Boolean | log] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $data: js.UndefOr[Boolean] = js.undefined,
    addUsedSchema: js.UndefOr[Boolean] = js.undefined,
    allErrors: js.UndefOr[Boolean] = js.undefined,
    async: Boolean | String = null,
    cache: js.Object = null,
    coerceTypes: Boolean | array = null,
    errorDataPath: String = null,
    extendRefs: `true` | ignore | fail = null,
    format: `false` | String = null,
    formats: js.Object = null,
    inlineRefs: Boolean | Double = null,
    jsonPointers: js.UndefOr[Boolean] = js.undefined,
    keywords: js.Object = null,
    loadSchema: (/* uri */ String, /* cb */ js.UndefOr[js.Function2[/* err */ Error, /* schema */ js.Object, Unit]]) => js.Thenable[js.Object | Boolean] = null,
    logger: CustomLogger | `false` = null,
    loopRequired: js.UndefOr[Double] = js.undefined,
    messages: js.UndefOr[Boolean] = js.undefined,
    meta: Boolean | js.Object = null,
    missingRefs: `true` | ignore | fail = null,
    multipleOfPrecision: Boolean | Double = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    ownProperties: js.UndefOr[Boolean] = js.undefined,
    passContext: js.UndefOr[Boolean] = js.undefined,
    processCode: /* code */ String => String = null,
    removeAdditional: Boolean | all | failing = null,
    schemaId: $id | id | auto = null,
    schemas: js.Array[js.Object] | js.Object = null,
    serialize: (js.Function1[/* schema */ js.Object | Boolean, _]) | `false` = null,
    sourceCode: js.UndefOr[Boolean] = js.undefined,
    strictDefaults: Boolean | log = null,
    strictKeywords: Boolean | log = null,
    transpile: String | (js.Function1[/* code */ String, String]) = null,
    unicode: js.UndefOr[Boolean] = js.undefined,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    unknownFormats: `true` | js.Array[String] | ignore = null,
    useDefaults: Boolean | empty | shared = null,
    validateSchema: Boolean | log = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($data)) __obj.updateDynamic("$data")($data.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addUsedSchema)) __obj.updateDynamic("addUsedSchema")(addUsedSchema.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allErrors)) __obj.updateDynamic("allErrors")(allErrors.get.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (coerceTypes != null) __obj.updateDynamic("coerceTypes")(coerceTypes.asInstanceOf[js.Any])
    if (errorDataPath != null) __obj.updateDynamic("errorDataPath")(errorDataPath.asInstanceOf[js.Any])
    if (extendRefs != null) __obj.updateDynamic("extendRefs")(extendRefs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (inlineRefs != null) __obj.updateDynamic("inlineRefs")(inlineRefs.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonPointers)) __obj.updateDynamic("jsonPointers")(jsonPointers.get.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (loadSchema != null) __obj.updateDynamic("loadSchema")(js.Any.fromFunction2(loadSchema))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(loopRequired)) __obj.updateDynamic("loopRequired")(loopRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messages)) __obj.updateDynamic("messages")(messages.get.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (missingRefs != null) __obj.updateDynamic("missingRefs")(missingRefs.asInstanceOf[js.Any])
    if (multipleOfPrecision != null) __obj.updateDynamic("multipleOfPrecision")(multipleOfPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ownProperties)) __obj.updateDynamic("ownProperties")(ownProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passContext)) __obj.updateDynamic("passContext")(passContext.get.asInstanceOf[js.Any])
    if (processCode != null) __obj.updateDynamic("processCode")(js.Any.fromFunction1(processCode))
    if (removeAdditional != null) __obj.updateDynamic("removeAdditional")(removeAdditional.asInstanceOf[js.Any])
    if (schemaId != null) __obj.updateDynamic("schemaId")(schemaId.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceCode)) __obj.updateDynamic("sourceCode")(sourceCode.get.asInstanceOf[js.Any])
    if (strictDefaults != null) __obj.updateDynamic("strictDefaults")(strictDefaults.asInstanceOf[js.Any])
    if (strictKeywords != null) __obj.updateDynamic("strictKeywords")(strictKeywords.asInstanceOf[js.Any])
    if (transpile != null) __obj.updateDynamic("transpile")(transpile.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    if (unknownFormats != null) __obj.updateDynamic("unknownFormats")(unknownFormats.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    if (validateSchema != null) __obj.updateDynamic("validateSchema")(validateSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

