package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseFilter")
@js.native
abstract class BaseFilter[T, P /* <: agDashGridLib.distLibInterfacesIFilterMod.IFilterParams */, M] ()
  extends agDashGridLib.distLibFilterBaseFilterMod.BaseFilter[T, P, M]

/* static members */
@JSImport("ag-grid", "BaseFilter")
@js.native
object BaseFilter extends js.Object {
  var CONTAINS: java.lang.String = js.native
  var ENDS_WITH: java.lang.String = js.native
  var EQUALS: java.lang.String = js.native
  var GREATER_THAN: java.lang.String = js.native
  var GREATER_THAN_OR_EQUAL: java.lang.String = js.native
  var IN_RANGE: java.lang.String = js.native
  var LESS_THAN: java.lang.String = js.native
  var LESS_THAN_OR_EQUAL: java.lang.String = js.native
  var NOT_CONTAINS: java.lang.String = js.native
  var NOT_EQUAL: java.lang.String = js.native
  var STARTS_WITH: java.lang.String = js.native
}

