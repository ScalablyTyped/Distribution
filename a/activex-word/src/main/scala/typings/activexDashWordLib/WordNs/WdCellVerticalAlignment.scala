package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCellVerticalAlignment extends js.Object

@JSGlobal("Word.WdCellVerticalAlignment")
@js.native
object WdCellVerticalAlignment extends js.Object {
  @js.native
  sealed trait wdCellAlignVerticalBottom
    extends activexDashWordLib.WordNs.WdCellVerticalAlignment
  
  @js.native
  sealed trait wdCellAlignVerticalCenter
    extends activexDashWordLib.WordNs.WdCellVerticalAlignment
  
  @js.native
  sealed trait wdCellAlignVerticalTop
    extends activexDashWordLib.WordNs.WdCellVerticalAlignment
  
  /* 3 */ val wdCellAlignVerticalBottom: wdCellAlignVerticalBottom with scala.Double = js.native
  /* 1 */ val wdCellAlignVerticalCenter: wdCellAlignVerticalCenter with scala.Double = js.native
  /* 0 */ val wdCellAlignVerticalTop: wdCellAlignVerticalTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCellVerticalAlignment with scala.Double] = js.native
}

