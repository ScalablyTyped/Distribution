package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDeleteCells extends js.Object

@JSGlobal("Word.WdDeleteCells")
@js.native
object WdDeleteCells extends js.Object {
  @js.native
  sealed trait wdDeleteCellsEntireColumn
    extends activexDashWordLib.WordNs.WdDeleteCells
  
  @js.native
  sealed trait wdDeleteCellsEntireRow
    extends activexDashWordLib.WordNs.WdDeleteCells
  
  @js.native
  sealed trait wdDeleteCellsShiftLeft
    extends activexDashWordLib.WordNs.WdDeleteCells
  
  @js.native
  sealed trait wdDeleteCellsShiftUp
    extends activexDashWordLib.WordNs.WdDeleteCells
  
  /* 3 */ val wdDeleteCellsEntireColumn: wdDeleteCellsEntireColumn with scala.Double = js.native
  /* 2 */ val wdDeleteCellsEntireRow: wdDeleteCellsEntireRow with scala.Double = js.native
  /* 0 */ val wdDeleteCellsShiftLeft: wdDeleteCellsShiftLeft with scala.Double = js.native
  /* 1 */ val wdDeleteCellsShiftUp: wdDeleteCellsShiftUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDeleteCells with scala.Double] = js.native
}

