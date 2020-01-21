package typings.antd.buttonButtonMod

import typings.antd.AnonDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonState extends js.Object {
  var hasTwoCNChar: Boolean
  var loading: js.UndefOr[Boolean | AnonDelay] = js.undefined
}

object ButtonState {
  @scala.inline
  def apply(hasTwoCNChar: Boolean, loading: Boolean | AnonDelay = null): ButtonState = {
    val __obj = js.Dynamic.literal(hasTwoCNChar = hasTwoCNChar.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonState]
  }
}

