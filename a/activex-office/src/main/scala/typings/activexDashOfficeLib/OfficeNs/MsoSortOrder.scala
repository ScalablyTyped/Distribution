package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSortOrder extends js.Object

@JSGlobal("Office.MsoSortOrder")
@js.native
object MsoSortOrder extends js.Object {
  @js.native
  sealed trait msoSortOrderAscending
    extends activexDashOfficeLib.OfficeNs.MsoSortOrder
  
  @js.native
  sealed trait msoSortOrderDescending
    extends activexDashOfficeLib.OfficeNs.MsoSortOrder
  
  /* 1 */ val msoSortOrderAscending: msoSortOrderAscending with scala.Double = js.native
  /* 2 */ val msoSortOrderDescending: msoSortOrderDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSortOrder with scala.Double] = js.native
}

