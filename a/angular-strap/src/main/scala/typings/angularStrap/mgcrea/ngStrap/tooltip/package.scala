package typings.angularStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tooltip {
  type ITooltipService = js.Function2[
    /* element */ typings.angular.mod.IAugmentedJQuery, 
    /* config */ js.UndefOr[typings.angularStrap.mgcrea.ngStrap.tooltip.ITooltipOptions], 
    typings.angularStrap.mgcrea.ngStrap.tooltip.ITooltip
  ]
}
