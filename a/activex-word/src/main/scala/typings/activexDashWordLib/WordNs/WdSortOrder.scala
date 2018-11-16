package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSortOrder extends js.Object

@JSGlobal("Word.WdSortOrder")
@js.native
object WdSortOrder extends js.Object {
  @js.native
  sealed trait wdSortOrderAscending
    extends activexDashWordLib.WordNs.WdSortOrder
  
  @js.native
  sealed trait wdSortOrderDescending
    extends activexDashWordLib.WordNs.WdSortOrder
  
  /* 0 */ val wdSortOrderAscending: wdSortOrderAscending with scala.Double = js.native
  /* 1 */ val wdSortOrderDescending: wdSortOrderDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSortOrder with scala.Double] = js.native
}

