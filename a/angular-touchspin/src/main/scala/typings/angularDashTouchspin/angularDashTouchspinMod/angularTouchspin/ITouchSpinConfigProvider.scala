package typings.angularDashTouchspin.angularDashTouchspinMod.angularTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchSpinConfigProvider extends js.Object {
  def defaults(touchSpinOptions: ITouchSpinOptions): Unit
}

object ITouchSpinConfigProvider {
  @scala.inline
  def apply(defaults: ITouchSpinOptions => Unit): ITouchSpinConfigProvider = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[ITouchSpinConfigProvider]
  }
}

