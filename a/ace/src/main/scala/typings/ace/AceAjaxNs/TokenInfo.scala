package typings.ace.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var value: String
}

object TokenInfo {
  @scala.inline
  def apply(value: String, index: Int | Double = null, start: Int | Double = null): TokenInfo = {
    val __obj = js.Dynamic.literal(value = value)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
}

