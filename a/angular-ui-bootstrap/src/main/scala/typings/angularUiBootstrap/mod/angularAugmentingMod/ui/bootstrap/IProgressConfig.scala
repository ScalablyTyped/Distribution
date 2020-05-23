package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressConfig extends js.Object {
  /**
    * Whether bars use transitions to achieve the width change.
    *
    * @default: true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * A number that specifies the total value of bars that is required.
    *
    * @default: 100
    */
  var max: js.UndefOr[Double] = js.undefined
}

object IProgressConfig {
  @scala.inline
  def apply(animate: js.UndefOr[Boolean] = js.undefined, max: js.UndefOr[Double] = js.undefined): IProgressConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressConfig]
  }
}

