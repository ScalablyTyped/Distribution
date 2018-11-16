package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdInsertCells extends js.Object

@JSGlobal("Word.WdInsertCells")
@js.native
object WdInsertCells extends js.Object {
  @js.native
  sealed trait wdInsertCellsEntireColumn
    extends activexDashWordLib.WordNs.WdInsertCells
  
  @js.native
  sealed trait wdInsertCellsEntireRow
    extends activexDashWordLib.WordNs.WdInsertCells
  
  @js.native
  sealed trait wdInsertCellsShiftDown
    extends activexDashWordLib.WordNs.WdInsertCells
  
  @js.native
  sealed trait wdInsertCellsShiftRight
    extends activexDashWordLib.WordNs.WdInsertCells
  
  /* 3 */ val wdInsertCellsEntireColumn: wdInsertCellsEntireColumn with scala.Double = js.native
  /* 2 */ val wdInsertCellsEntireRow: wdInsertCellsEntireRow with scala.Double = js.native
  /* 1 */ val wdInsertCellsShiftDown: wdInsertCellsShiftDown with scala.Double = js.native
  /* 0 */ val wdInsertCellsShiftRight: wdInsertCellsShiftRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdInsertCells with scala.Double] = js.native
}

