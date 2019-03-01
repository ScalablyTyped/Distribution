package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.tooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProvider extends js.Object {
  var defaults: ITooltipOptions
}

object ITooltipProvider {
  @scala.inline
  def apply(defaults: ITooltipOptions): ITooltipProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[ITooltipProvider]
  }
}

