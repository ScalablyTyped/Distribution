package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMergeFormatFrom extends js.Object

@JSGlobal("Word.WdMergeFormatFrom")
@js.native
object WdMergeFormatFrom extends js.Object {
  @js.native
  sealed trait wdMergeFormatFromOriginal
    extends activexDashWordLib.WordNs.WdMergeFormatFrom
  
  @js.native
  sealed trait wdMergeFormatFromPrompt
    extends activexDashWordLib.WordNs.WdMergeFormatFrom
  
  @js.native
  sealed trait wdMergeFormatFromRevised
    extends activexDashWordLib.WordNs.WdMergeFormatFrom
  
  /* 0 */ val wdMergeFormatFromOriginal: wdMergeFormatFromOriginal with scala.Double = js.native
  /* 2 */ val wdMergeFormatFromPrompt: wdMergeFormatFromPrompt with scala.Double = js.native
  /* 1 */ val wdMergeFormatFromRevised: wdMergeFormatFromRevised with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMergeFormatFrom with scala.Double] = js.native
}

