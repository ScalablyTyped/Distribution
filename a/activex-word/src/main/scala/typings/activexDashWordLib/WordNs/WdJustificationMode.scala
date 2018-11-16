package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdJustificationMode extends js.Object

@JSGlobal("Word.WdJustificationMode")
@js.native
object WdJustificationMode extends js.Object {
  @js.native
  sealed trait wdJustificationModeCompress
    extends activexDashWordLib.WordNs.WdJustificationMode
  
  @js.native
  sealed trait wdJustificationModeCompressKana
    extends activexDashWordLib.WordNs.WdJustificationMode
  
  @js.native
  sealed trait wdJustificationModeExpand
    extends activexDashWordLib.WordNs.WdJustificationMode
  
  /* 1 */ val wdJustificationModeCompress: wdJustificationModeCompress with scala.Double = js.native
  /* 2 */ val wdJustificationModeCompressKana: wdJustificationModeCompressKana with scala.Double = js.native
  /* 0 */ val wdJustificationModeExpand: wdJustificationModeExpand with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdJustificationMode with scala.Double] = js.native
}

