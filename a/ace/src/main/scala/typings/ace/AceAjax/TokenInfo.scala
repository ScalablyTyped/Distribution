package typings.ace.AceAjax

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
  def apply(value: String, index: js.UndefOr[Double] = js.undefined, start: js.UndefOr[Double] = js.undefined): TokenInfo = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
}

