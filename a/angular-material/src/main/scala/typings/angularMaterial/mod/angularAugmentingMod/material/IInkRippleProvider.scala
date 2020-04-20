package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRippleProvider extends js.Object {
  def disableInkRipple(): Unit
}

object IInkRippleProvider {
  @scala.inline
  def apply(disableInkRipple: () => Unit): IInkRippleProvider = {
    val __obj = js.Dynamic.literal(disableInkRipple = js.Any.fromFunction0(disableInkRipple))
    __obj.asInstanceOf[IInkRippleProvider]
  }
}

