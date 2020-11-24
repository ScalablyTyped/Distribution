package typings.agGrid.mainMod

import typings.agGrid.iFilterMod.IFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "BaseFilter")
@js.native
abstract class BaseFilter[T, P /* <: IFilterParams */, M] ()
  extends typings.agGrid.baseFilterMod.BaseFilter[T, P, M]
/* static members */
@JSImport("ag-grid/dist/lib/main", "BaseFilter")
@js.native
object BaseFilter extends js.Object {
  
  var CONTAINS: String = js.native
  
  var ENDS_WITH: String = js.native
  
  var EQUALS: String = js.native
  
  var GREATER_THAN: String = js.native
  
  var GREATER_THAN_OR_EQUAL: String = js.native
  
  var IN_RANGE: String = js.native
  
  var LESS_THAN: String = js.native
  
  var LESS_THAN_OR_EQUAL: String = js.native
  
  var NOT_CONTAINS: String = js.native
  
  var NOT_EQUAL: String = js.native
  
  var STARTS_WITH: String = js.native
}
