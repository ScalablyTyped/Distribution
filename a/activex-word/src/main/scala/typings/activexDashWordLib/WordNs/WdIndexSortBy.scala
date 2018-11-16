package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdIndexSortBy extends js.Object

@JSGlobal("Word.WdIndexSortBy")
@js.native
object WdIndexSortBy extends js.Object {
  @js.native
  sealed trait wdIndexSortByStroke
    extends activexDashWordLib.WordNs.WdIndexSortBy
  
  @js.native
  sealed trait wdIndexSortBySyllable
    extends activexDashWordLib.WordNs.WdIndexSortBy
  
  /* 0 */ val wdIndexSortByStroke: wdIndexSortByStroke with scala.Double = js.native
  /* 1 */ val wdIndexSortBySyllable: wdIndexSortBySyllable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdIndexSortBy with scala.Double] = js.native
}

