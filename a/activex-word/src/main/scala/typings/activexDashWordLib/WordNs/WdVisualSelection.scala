package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdVisualSelection extends js.Object

@JSGlobal("Word.WdVisualSelection")
@js.native
object WdVisualSelection extends js.Object {
  @js.native
  sealed trait wdVisualSelectionBlock
    extends activexDashWordLib.WordNs.WdVisualSelection
  
  @js.native
  sealed trait wdVisualSelectionContinuous
    extends activexDashWordLib.WordNs.WdVisualSelection
  
  /* 0 */ val wdVisualSelectionBlock: wdVisualSelectionBlock with scala.Double = js.native
  /* 1 */ val wdVisualSelectionContinuous: wdVisualSelectionContinuous with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdVisualSelection with scala.Double] = js.native
}

