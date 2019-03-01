package typings
package antdLib.libButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonState extends js.Object {
  var hasTwoCNChar: scala.Boolean
  var loading: js.UndefOr[scala.Boolean | antdLib.Anon_Delay] = js.undefined
}

object ButtonState {
  @scala.inline
  def apply(hasTwoCNChar: scala.Boolean, loading: scala.Boolean | antdLib.Anon_Delay = null): ButtonState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasTwoCNChar")(hasTwoCNChar)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonState]
  }
}

