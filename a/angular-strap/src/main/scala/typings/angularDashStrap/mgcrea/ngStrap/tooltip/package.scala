package typings.angularDashStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tooltip {
  import typings.angular.angularMod.IAugmentedJQuery

  type ITooltipService = js.Function2[/* element */ IAugmentedJQuery, /* config */ js.UndefOr[ITooltipOptions], ITooltip]
}
