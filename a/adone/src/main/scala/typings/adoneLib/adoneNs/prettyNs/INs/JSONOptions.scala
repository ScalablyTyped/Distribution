package typings
package adoneLib.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONOptions extends js.Object {
  var dashColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultIndentation: js.UndefOr[scala.Double] = js.undefined
  var emptyArrayMsg: js.UndefOr[java.lang.String] = js.undefined
  var keysColor: js.UndefOr[java.lang.String] = js.undefined
  var noAlign: js.UndefOr[scala.Boolean] = js.undefined
  var noColor: js.UndefOr[scala.Boolean] = js.undefined
  var numberColor: js.UndefOr[java.lang.String] = js.undefined
  var stringColor: js.UndefOr[java.lang.String] = js.undefined
}

object JSONOptions {
  @scala.inline
  def apply(
    dashColor: java.lang.String = null,
    defaultIndentation: scala.Int | scala.Double = null,
    emptyArrayMsg: java.lang.String = null,
    keysColor: java.lang.String = null,
    noAlign: js.UndefOr[scala.Boolean] = js.undefined,
    noColor: js.UndefOr[scala.Boolean] = js.undefined,
    numberColor: java.lang.String = null,
    stringColor: java.lang.String = null
  ): JSONOptions = {
    val __obj = js.Dynamic.literal()
    if (dashColor != null) __obj.updateDynamic("dashColor")(dashColor)
    if (defaultIndentation != null) __obj.updateDynamic("defaultIndentation")(defaultIndentation.asInstanceOf[js.Any])
    if (emptyArrayMsg != null) __obj.updateDynamic("emptyArrayMsg")(emptyArrayMsg)
    if (keysColor != null) __obj.updateDynamic("keysColor")(keysColor)
    if (!js.isUndefined(noAlign)) __obj.updateDynamic("noAlign")(noAlign)
    if (!js.isUndefined(noColor)) __obj.updateDynamic("noColor")(noColor)
    if (numberColor != null) __obj.updateDynamic("numberColor")(numberColor)
    if (stringColor != null) __obj.updateDynamic("stringColor")(stringColor)
    __obj.asInstanceOf[JSONOptions]
  }
}

