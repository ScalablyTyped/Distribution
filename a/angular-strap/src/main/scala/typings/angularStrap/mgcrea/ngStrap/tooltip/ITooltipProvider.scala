package typings.angularStrap.mgcrea.ngStrap.tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProvider extends js.Object {
  var defaults: ITooltipOptions
}

object ITooltipProvider {
  @scala.inline
  def apply(defaults: ITooltipOptions): ITooltipProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITooltipProvider]
  }
}

