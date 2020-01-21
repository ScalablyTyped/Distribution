package typings.angularStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeahead {
  type ITypeaheadService = js.Function3[
    /* element */ typings.angular.mod.IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[typings.angularStrap.mgcrea.ngStrap.typeahead.ITypeaheadOptions], 
    typings.angularStrap.mgcrea.ngStrap.typeahead.ITypeahead
  ]
}
