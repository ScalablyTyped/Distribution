package typings.angularStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popover {
  type IPopoverService = js.Function2[
    /* element */ typings.angular.mod.IAugmentedJQuery, 
    /* config */ js.UndefOr[typings.angularStrap.mgcrea.ngStrap.popover.IPopoverOptions], 
    typings.angularStrap.mgcrea.ngStrap.popover.IPopover
  ]
}
