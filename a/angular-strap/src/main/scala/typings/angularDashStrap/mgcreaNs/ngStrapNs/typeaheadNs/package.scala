package typings.angularDashStrap.mgcreaNs.ngStrapNs

import typings.angular.angularMod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeaheadNs {
  type ITypeaheadService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[ITypeaheadOptions], 
    ITypeahead
  ]
}
