package typings.angularDashStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeahead {
  import typings.angular.angularMod.IAugmentedJQuery

  type ITypeaheadService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[ITypeaheadOptions], 
    ITypeahead
  ]
}
