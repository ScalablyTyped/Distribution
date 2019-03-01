package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String
}

object TokenInfo {
  @scala.inline
  def apply(
    value: java.lang.String,
    index: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): TokenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
}

