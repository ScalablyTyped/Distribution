package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSEscOptions extends js.Object {
  var __inline1__ : js.UndefOr[Boolean] = js.undefined
  var __inline2__ : js.UndefOr[Boolean] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var es6: js.UndefOr[Boolean] = js.undefined
  var escapeEverything: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var indentLevel: js.UndefOr[Double] = js.undefined
  var isScriptContext: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var lowercaseHex: js.UndefOr[Boolean] = js.undefined
  var minimal: js.UndefOr[Boolean] = js.undefined
  var numbers: js.UndefOr[String] = js.undefined
  var quotes: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object JSEscOptions {
  @scala.inline
  def apply(
    __inline1__ : js.UndefOr[Boolean] = js.undefined,
    __inline2__ : js.UndefOr[Boolean] = js.undefined,
    compact: js.UndefOr[Boolean] = js.undefined,
    es6: js.UndefOr[Boolean] = js.undefined,
    escapeEverything: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    indentLevel: Int | Double = null,
    isScriptContext: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    lowercaseHex: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    numbers: String = null,
    quotes: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): JSEscOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__inline1__)) __obj.updateDynamic("__inline1__")(__inline1__)
    if (!js.isUndefined(__inline2__)) __obj.updateDynamic("__inline2__")(__inline2__)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(es6)) __obj.updateDynamic("es6")(es6)
    if (!js.isUndefined(escapeEverything)) __obj.updateDynamic("escapeEverything")(escapeEverything)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (indentLevel != null) __obj.updateDynamic("indentLevel")(indentLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(isScriptContext)) __obj.updateDynamic("isScriptContext")(isScriptContext)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(lowercaseHex)) __obj.updateDynamic("lowercaseHex")(lowercaseHex)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (numbers != null) __obj.updateDynamic("numbers")(numbers)
    if (quotes != null) __obj.updateDynamic("quotes")(quotes)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[JSEscOptions]
  }
}

