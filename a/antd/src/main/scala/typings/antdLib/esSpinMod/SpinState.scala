package typings
package antdLib.esSpinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinState extends js.Object {
  var notCssAnimationSupported: js.UndefOr[scala.Boolean] = js.undefined
  var spinning: js.UndefOr[scala.Boolean] = js.undefined
}

object SpinState {
  @scala.inline
  def apply(
    notCssAnimationSupported: js.UndefOr[scala.Boolean] = js.undefined,
    spinning: js.UndefOr[scala.Boolean] = js.undefined
  ): SpinState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notCssAnimationSupported)) __obj.updateDynamic("notCssAnimationSupported")(notCssAnimationSupported)
    if (!js.isUndefined(spinning)) __obj.updateDynamic("spinning")(spinning)
    __obj.asInstanceOf[SpinState]
  }
}

