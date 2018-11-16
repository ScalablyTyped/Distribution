package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathBreakBin extends js.Object

@JSGlobal("Word.WdOMathBreakBin")
@js.native
object WdOMathBreakBin extends js.Object {
  @js.native
  sealed trait wdOMathBreakBinAfter
    extends activexDashWordLib.WordNs.WdOMathBreakBin
  
  @js.native
  sealed trait wdOMathBreakBinBefore
    extends activexDashWordLib.WordNs.WdOMathBreakBin
  
  @js.native
  sealed trait wdOMathBreakBinRepeat
    extends activexDashWordLib.WordNs.WdOMathBreakBin
  
  /* 1 */ val wdOMathBreakBinAfter: wdOMathBreakBinAfter with scala.Double = js.native
  /* 0 */ val wdOMathBreakBinBefore: wdOMathBreakBinBefore with scala.Double = js.native
  /* 2 */ val wdOMathBreakBinRepeat: wdOMathBreakBinRepeat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathBreakBin with scala.Double] = js.native
}

