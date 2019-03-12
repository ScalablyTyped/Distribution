package typings
package angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchSpinConfigProvider extends js.Object {
  def defaults(touchSpinOptions: ITouchSpinOptions): scala.Unit
}

object ITouchSpinConfigProvider {
  @scala.inline
  def apply(defaults: ITouchSpinOptions => scala.Unit): ITouchSpinConfigProvider = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[ITouchSpinConfigProvider]
  }
}

