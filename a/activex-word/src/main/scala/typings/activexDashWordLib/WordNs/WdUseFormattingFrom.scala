package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdUseFormattingFrom extends js.Object

@JSGlobal("Word.WdUseFormattingFrom")
@js.native
object WdUseFormattingFrom extends js.Object {
  @js.native
  sealed trait wdFormattingFromCurrent
    extends activexDashWordLib.WordNs.WdUseFormattingFrom
  
  @js.native
  sealed trait wdFormattingFromPrompt
    extends activexDashWordLib.WordNs.WdUseFormattingFrom
  
  @js.native
  sealed trait wdFormattingFromSelected
    extends activexDashWordLib.WordNs.WdUseFormattingFrom
  
  /* 0 */ val wdFormattingFromCurrent: wdFormattingFromCurrent with scala.Double = js.native
  /* 2 */ val wdFormattingFromPrompt: wdFormattingFromPrompt with scala.Double = js.native
  /* 1 */ val wdFormattingFromSelected: wdFormattingFromSelected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdUseFormattingFrom with scala.Double] = js.native
}

