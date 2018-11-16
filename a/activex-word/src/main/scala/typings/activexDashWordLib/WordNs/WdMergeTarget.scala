package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMergeTarget extends js.Object

@JSGlobal("Word.WdMergeTarget")
@js.native
object WdMergeTarget extends js.Object {
  @js.native
  sealed trait wdMergeTargetCurrent
    extends activexDashWordLib.WordNs.WdMergeTarget
  
  @js.native
  sealed trait wdMergeTargetNew
    extends activexDashWordLib.WordNs.WdMergeTarget
  
  @js.native
  sealed trait wdMergeTargetSelected
    extends activexDashWordLib.WordNs.WdMergeTarget
  
  /* 1 */ val wdMergeTargetCurrent: wdMergeTargetCurrent with scala.Double = js.native
  /* 2 */ val wdMergeTargetNew: wdMergeTargetNew with scala.Double = js.native
  /* 0 */ val wdMergeTargetSelected: wdMergeTargetSelected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMergeTarget with scala.Double] = js.native
}

