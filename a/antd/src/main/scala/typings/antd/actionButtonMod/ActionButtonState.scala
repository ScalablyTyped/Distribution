package typings.antd.actionButtonMod

import typings.antd.AnonDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonState extends js.Object {
  var loading: js.UndefOr[Boolean | AnonDelay] = js.undefined
}

object ActionButtonState {
  @scala.inline
  def apply(loading: Boolean | AnonDelay = null): ActionButtonState = {
    val __obj = js.Dynamic.literal()
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonState]
  }
}

