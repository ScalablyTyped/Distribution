package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRowHeightRule extends js.Object

@JSGlobal("Word.WdRowHeightRule")
@js.native
object WdRowHeightRule extends js.Object {
  @js.native
  sealed trait wdRowHeightAtLeast
    extends activexDashWordLib.WordNs.WdRowHeightRule
  
  @js.native
  sealed trait wdRowHeightAuto
    extends activexDashWordLib.WordNs.WdRowHeightRule
  
  @js.native
  sealed trait wdRowHeightExactly
    extends activexDashWordLib.WordNs.WdRowHeightRule
  
  /* 1 */ val wdRowHeightAtLeast: wdRowHeightAtLeast with scala.Double = js.native
  /* 0 */ val wdRowHeightAuto: wdRowHeightAuto with scala.Double = js.native
  /* 2 */ val wdRowHeightExactly: wdRowHeightExactly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRowHeightRule with scala.Double] = js.native
}

