package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCompareTarget extends js.Object

@JSGlobal("Word.WdCompareTarget")
@js.native
object WdCompareTarget extends js.Object {
  @js.native
  sealed trait wdCompareTargetCurrent
    extends activexDashWordLib.WordNs.WdCompareTarget
  
  @js.native
  sealed trait wdCompareTargetNew
    extends activexDashWordLib.WordNs.WdCompareTarget
  
  @js.native
  sealed trait wdCompareTargetSelected
    extends activexDashWordLib.WordNs.WdCompareTarget
  
  /* 1 */ val wdCompareTargetCurrent: wdCompareTargetCurrent with scala.Double = js.native
  /* 2 */ val wdCompareTargetNew: wdCompareTargetNew with scala.Double = js.native
  /* 0 */ val wdCompareTargetSelected: wdCompareTargetSelected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCompareTarget with scala.Double] = js.native
}

