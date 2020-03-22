package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var error: js.UndefOr[scala.Nothing] = js.undefined
  var info: AnonComponentStackString
}

object AnonInfo {
  @scala.inline
  def apply(info: AnonComponentStackString, error: js.UndefOr[scala.Nothing] = js.undefined): AnonInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfo]
  }
}

