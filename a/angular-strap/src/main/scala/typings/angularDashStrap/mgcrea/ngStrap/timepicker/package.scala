package typings.angularDashStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object timepicker {
  import typings.angular.angularMod.IAugmentedJQuery

  type ITimepickerService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[ITimepickerOptions], 
    ITimepicker
  ]
}
