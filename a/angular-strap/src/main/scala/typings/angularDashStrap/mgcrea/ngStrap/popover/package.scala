package typings.angularDashStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popover {
  import typings.angular.angularMod.IAugmentedJQuery

  type IPopoverService = js.Function2[/* element */ IAugmentedJQuery, /* config */ js.UndefOr[IPopoverOptions], IPopover]
}
