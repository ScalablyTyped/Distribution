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
  def apply(defaults: js.Function1[ITouchSpinOptions, scala.Unit]): ITouchSpinConfigProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[ITouchSpinConfigProvider]
  }
}

