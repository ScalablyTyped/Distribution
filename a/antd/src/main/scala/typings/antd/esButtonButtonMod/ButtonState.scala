package typings.antd.esButtonButtonMod

import typings.antd.Anon_Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonState extends js.Object {
  var hasTwoCNChar: Boolean
  var loading: js.UndefOr[Boolean | Anon_Delay] = js.undefined
}

object ButtonState {
  @scala.inline
  def apply(hasTwoCNChar: Boolean, loading: Boolean | Anon_Delay = null): ButtonState = {
    val __obj = js.Dynamic.literal(hasTwoCNChar = hasTwoCNChar)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonState]
  }
}

