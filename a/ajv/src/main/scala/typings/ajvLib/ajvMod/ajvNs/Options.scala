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

