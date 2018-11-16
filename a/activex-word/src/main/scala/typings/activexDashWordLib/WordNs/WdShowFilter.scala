package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdShowFilter extends js.Object

@JSGlobal("Word.WdShowFilter")
@js.native
object WdShowFilter extends js.Object {
  @js.native
  sealed trait wdShowFilterFormattingAvailable
    extends activexDashWordLib.WordNs.WdShowFilter
  
  @js.native
  sealed trait wdShowFilterFormattingInUse
    extends activexDashWordLib.WordNs.WdShowFilter
  
  @js.native
  sealed trait wdShowFilterFormattingRecommended
    extends activexDashWordLib.WordNs.WdShowFilter
  
  @js.native
  sealed trait wdShowFilterStylesAll
    extends activexDashWordLib.WordNs.WdShowFilter
  
  @js.native
  sealed trait wdShowFilterStylesAvailable
    extends activexDashWordLib.WordNs.WdShowFilter
  
  @js.native
  sealed trait wdShowFilterStylesInUse
    extends activexDashWordLib.WordNs.WdShowFilter
  
  /* 4 */ val wdShowFilterFormattingAvailable: wdShowFilterFormattingAvailable with scala.Double = js.native
  /* 3 */ val wdShowFilterFormattingInUse: wdShowFilterFormattingInUse with scala.Double = js.native
  /* 5 */ val wdShowFilterFormattingRecommended: wdShowFilterFormattingRecommended with scala.Double = js.native
  /* 2 */ val wdShowFilterStylesAll: wdShowFilterStylesAll with scala.Double = js.native
  /* 0 */ val wdShowFilterStylesAvailable: wdShowFilterStylesAvailable with scala.Double = js.native
  /* 1 */ val wdShowFilterStylesInUse: wdShowFilterStylesInUse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdShowFilter with scala.Double] = js.native
}

