package typings
package antdLib.libModalActionButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonState extends js.Object {
  var loading: scala.Boolean
}

object ActionButtonState {
  @scala.inline
  def apply(loading: scala.Boolean): ActionButtonState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[ActionButtonState]
  }
}

