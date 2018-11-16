package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathBreakSub extends js.Object

@JSGlobal("Word.WdOMathBreakSub")
@js.native
object WdOMathBreakSub extends js.Object {
  @js.native
  sealed trait wdOMathBreakSubMinusMinus
    extends activexDashWordLib.WordNs.WdOMathBreakSub
  
  @js.native
  sealed trait wdOMathBreakSubMinusPlus
    extends activexDashWordLib.WordNs.WdOMathBreakSub
  
  @js.native
  sealed trait wdOMathBreakSubPlusMinus
    extends activexDashWordLib.WordNs.WdOMathBreakSub
  
  /* 0 */ val wdOMathBreakSubMinusMinus: wdOMathBreakSubMinusMinus with scala.Double = js.native
  /* 2 */ val wdOMathBreakSubMinusPlus: wdOMathBreakSubMinusPlus with scala.Double = js.native
  /* 1 */ val wdOMathBreakSubPlusMinus: wdOMathBreakSubPlusMinus with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathBreakSub with scala.Double] = js.native
}

