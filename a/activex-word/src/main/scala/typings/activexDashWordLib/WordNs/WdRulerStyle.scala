package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRulerStyle extends js.Object

@JSGlobal("Word.WdRulerStyle")
@js.native
object WdRulerStyle extends js.Object {
  @js.native
  sealed trait wdAdjustFirstColumn
    extends activexDashWordLib.WordNs.WdRulerStyle
  
  @js.native
  sealed trait wdAdjustNone
    extends activexDashWordLib.WordNs.WdRulerStyle
  
  @js.native
  sealed trait wdAdjustProportional
    extends activexDashWordLib.WordNs.WdRulerStyle
  
  @js.native
  sealed trait wdAdjustSameWidth
    extends activexDashWordLib.WordNs.WdRulerStyle
  
  /* 2 */ val wdAdjustFirstColumn: wdAdjustFirstColumn with scala.Double = js.native
  /* 0 */ val wdAdjustNone: wdAdjustNone with scala.Double = js.native
  /* 1 */ val wdAdjustProportional: wdAdjustProportional with scala.Double = js.native
  /* 3 */ val wdAdjustSameWidth: wdAdjustSameWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRulerStyle with scala.Double] = js.native
}

