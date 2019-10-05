package typings.angularDashStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object select {
  import typings.angular.angularMod.IAugmentedJQuery

  type ISelectService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ ISelectOptions, 
    ISelect
  ]
}
