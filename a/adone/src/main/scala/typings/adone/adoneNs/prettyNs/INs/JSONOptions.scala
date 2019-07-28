package typings.adone.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONOptions extends js.Object {
  var dashColor: js.UndefOr[String] = js.undefined
  var defaultIndentation: js.UndefOr[Double] = js.undefined
  var emptyArrayMsg: js.UndefOr[String] = js.undefined
  var keysColor: js.UndefOr[String] = js.undefined
  var noAlign: js.UndefOr[Boolean] = js.undefined
  var noColor: js.UndefOr[Boolean] = js.undefined
  var numberColor: js.UndefOr[String] = js.undefined
  var stringColor: js.UndefOr[String] = js.undefined
}

object JSONOptions {
  @scala.inline
  def apply(
    dashColor: String = null,
    defaultIndentation: Int | Double = null,
    emptyArrayMsg: String = null,
    keysColor: String = null,
    noAlign: js.UndefOr[Boolean] = js.undefined,
    noColor: js.UndefOr[Boolean] = js.undefined,
    numberColor: String = null,
    stringColor: String = null
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

