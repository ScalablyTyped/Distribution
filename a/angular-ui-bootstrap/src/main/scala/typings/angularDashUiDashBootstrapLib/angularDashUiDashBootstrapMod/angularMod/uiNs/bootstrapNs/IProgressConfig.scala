package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressConfig extends js.Object {
  /**
    * Whether bars use transitions to achieve the width change.
    *
    * @default: true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A number that specifies the total value of bars that is required.
    *
    * @default: 100
    */
  var max: js.UndefOr[scala.Double] = js.undefined
}

object IProgressConfig {
  @scala.inline
  def apply(animate: js.UndefOr[scala.Boolean] = js.undefined, max: scala.Int | scala.Double = null): IProgressConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressConfig]
  }
}

