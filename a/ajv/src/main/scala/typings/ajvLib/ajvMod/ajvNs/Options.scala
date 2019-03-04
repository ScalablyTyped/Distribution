package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[scala.Boolean] = js.undefined
  var addUsedSchema: js.UndefOr[scala.Boolean] = js.undefined
  var allErrors: js.UndefOr[scala.Boolean] = js.undefined
  var async: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var cache: js.UndefOr[js.Object] = js.undefined
  var coerceTypes: js.UndefOr[scala.Boolean | ajvLib.ajvLibStrings.array] = js.undefined
  var errorDataPath: js.UndefOr[java.lang.String] = js.undefined
  var extendRefs: js.UndefOr[
    ajvLib.ajvLibNumbers.`true` | ajvLib.ajvLibStrings.ignore | ajvLib.ajvLibStrings.fail
  ] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
  var inlineRefs: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var jsonPointers: js.UndefOr[scala.Boolean] = js.undefined
  var loadSchema: js.UndefOr[
    js.Function2[
      /* uri */ java.lang.String, 
      /* cb */ js.UndefOr[js.Function2[/* err */ stdLib.Error, /* schema */ js.Object, scala.Unit]], 
      js.Thenable[js.Object | scala.Boolean]
    ]
  ] = js.undefined
  var logger: js.UndefOr[CustomLogger | ajvLib.ajvLibNumbers.`false`] = js.undefined
  var loopRequired: js.UndefOr[scala.Double] = js.undefined
  var messages: js.UndefOr[scala.Boolean] = js.undefined
  var meta: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var missingRefs: js.UndefOr[
    ajvLib.ajvLibNumbers.`true` | ajvLib.ajvLibStrings.ignore | ajvLib.ajvLibStrings.fail
  ] = js.undefined
  var multipleOfPrecision: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  var ownProperties: js.UndefOr[scala.Boolean] = js.undefined
  var passContext: js.UndefOr[scala.Boolean] = js.undefined
  var processCode: js.UndefOr[js.Function1[/* code */ java.lang.String, java.lang.String]] = js.undefined
  var removeAdditional: js.UndefOr[scala.Boolean | ajvLib.ajvLibStrings.all | ajvLib.ajvLibStrings.failing] = js.undefined
  var schemaId: js.UndefOr[
    ajvLib.ajvLibStrings.DOLLARid | ajvLib.ajvLibStrings.id | ajvLib.ajvLibStrings.auto
  ] = js.undefined
  var schemas: js.UndefOr[js.Array[js.Object] | js.Object] = js.undefined
  var serialize: js.UndefOr[
    (js.Function1[/* schema */ js.Object | scala.Boolean, _]) | ajvLib.ajvLibNumbers.`false`
  ] = js.undefined
  var sourceCode: js.UndefOr[scala.Boolean] = js.undefined
  var strictDefaults: js.UndefOr[scala.Boolean | ajvLib.ajvLibStrings.log] = js.undefined
  var transpile: js.UndefOr[java.lang.String | (js.Function1[/* code */ java.lang.String, java.lang.String])] = js.undefined
  var unicode: js.UndefOr[scala.Boolean] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  var unknownFormats: js.UndefOr[
    ajvLib.ajvLibNumbers.`true` | js.Array[java.lang.String] | ajvLib.ajvLibStrings.ignore
  ] = js.undefined
  var useDefaults: js.UndefOr[scala.Boolean | ajvLib.ajvLibStrings.shared] = js.undefined
  var validateSchema: js.UndefOr[scala.Boolean | ajvLib.ajvLibStrings.log] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $data: js.UndefOr[scala.Boolean] = js.undefined,
    addUsedSchema: js.UndefOr[scala.Boolean] = js.undefined,
    allErrors: js.UndefOr[scala.Boolean] = js.undefined,
    async: scala.Boolean | java.lang.String = null,
    cache: js.Object = null,
    coerceTypes: scala.Boolean | ajvLib.ajvLibStrings.array = null,
    errorDataPath: java.lang.String = null,
    extendRefs: ajvLib.ajvLibNumbers.`true` | ajvLib.ajvLibStrings.ignore | ajvLib.ajvLibStrings.fail = null,
    format: java.lang.String = null,
    formats: js.Object = null,
    inlineRefs: scala.Boolean | scala.Double = null,
    jsonPointers: js.UndefOr[scala.Boolean] = js.undefined,
    loadSchema: js.Function2[
      /* uri */ java.lang.String, 
      /* cb */ js.UndefOr[js.Function2[/* err */ stdLib.Error, /* schema */ js.Object, scala.Unit]], 
      js.Thenable[js.Object | scala.Boolean]
    ] = null,
    logger: CustomLogger | ajvLib.ajvLibNumbers.`false` = null,
    loopRequired: scala.Int | scala.Double = null,
    messages: js.UndefOr[scala.Boolean] = js.undefined,
    meta: scala.Boolean | js.Object = null,
    missingRefs: ajvLib.ajvLibNumbers.`true` | ajvLib.ajvLibStrings.ignore | ajvLib.ajvLibStrings.fail = null,
    multipleOfPrecision: scala.Boolean | scala.Double = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    ownProperties: js.UndefOr[scala.Boolean] = js.undefined,
    passContext: js.UndefOr[scala.Boolean] = js.undefined,
    processCode: js.Function1[/* code */ java.lang.String, java.lang.String] = null,
    removeAdditional: scala.Boolean | ajvLib.ajvLibStrings.all | ajvLib.ajvLibStrings.failing = null,
    schemaId: ajvLib.ajvLibStrings.DOLLARid | ajvLib.ajvLibStrings.id | ajvLib.ajvLibStrings.auto = null,
    schemas: js.Array[js.Object] | js.Object = null,
    serialize: (js.Function1[/* schema */ js.Object | scala.Boolean, _]) | ajvLib.ajvLibNumbers.`false` = null,
    sourceCode: js.UndefOr[scala.Boolean] = js.undefined,
    strictDefaults: scala.Boolean | ajvLib.ajvLibStrings.log = null,
    transpile: java.lang.String | (js.Function1[/* code */ java.lang.String, java.lang.String]) = null,
    unicode: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined,
    unknownFormats: ajvLib.ajvLibNumbers.`true` | js.Array[java.lang.String] | ajvLib.ajvLibStrings.ignore = null,
    useDefaults: scala.Boolean | ajvLib.ajvLibStrings.shared = null,
    validateSchema: scala.Boolean | ajvLib.ajvLibStrings.log = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($data)) __obj.updateDynamic("$data")($data)
    if (!js.isUndefined(addUsedSchema)) __obj.updateDynamic("addUsedSchema")(addUsedSchema)
    if (!js.isUndefined(allErrors)) __obj.updateDynamic("allErrors")(allErrors)
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (coerceTypes != null) __obj.updateDynamic("coerceTypes")(coerceTypes.asInstanceOf[js.Any])
    if (errorDataPath != null) __obj.updateDynamic("errorDataPath")(errorDataPath)
    if (extendRefs != null) __obj.updateDynamic("extendRefs")(extendRefs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (inlineRefs != null) __obj.updateDynamic("inlineRefs")(inlineRefs.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonPointers)) __obj.updateDynamic("jsonPointers")(jsonPointers)
    if (loadSchema != null) __obj.updateDynamic("loadSchema")(loadSchema)
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loopRequired != null) __obj.updateDynamic("loopRequired")(loopRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(messages)) __obj.updateDynamic("messages")(messages)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (missingRefs != null) __obj.updateDynamic("missingRefs")(missingRefs.asInstanceOf[js.Any])
    if (multipleOfPrecision != null) __obj.updateDynamic("multipleOfPrecision")(multipleOfPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (!js.isUndefined(ownProperties)) __obj.updateDynamic("ownProperties")(ownProperties)
    if (!js.isUndefined(passContext)) __obj.updateDynamic("passContext")(passContext)
    if (processCode != null) __obj.updateDynamic("processCode")(processCode)
    if (removeAdditional != null) __obj.updateDynamic("removeAdditional")(removeAdditional.asInstanceOf[js.Any])
    if (schemaId != null) __obj.updateDynamic("schemaId")(schemaId.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceCode)) __obj.updateDynamic("sourceCode")(sourceCode)
    if (strictDefaults != null) __obj.updateDynamic("strictDefaults")(strictDefaults.asInstanceOf[js.Any])
    if (transpile != null) __obj.updateDynamic("transpile")(transpile.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    if (unknownFormats != null) __obj.updateDynamic("unknownFormats")(unknownFormats.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    if (validateSchema != null) __obj.updateDynamic("validateSchema")(validateSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

