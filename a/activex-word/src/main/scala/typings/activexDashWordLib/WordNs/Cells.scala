package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Cells")
@js.native
class Cells protected () extends js.Object {
  val Application: Application = js.native
  var Borders: Borders = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Height: scala.Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  val NestingLevel: scala.Double = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: scala.Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Shading: Shading = js.native
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  var Width: scala.Double = js.native
  var `Word.Cells_typekey`: Cells = js.native
  def Add(): Cell = js.native
  def Add(BeforeCell: js.Any): Cell = js.native
  def AutoFit(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Delete(ShiftCells: js.Any): scala.Unit = js.native
  def DistributeHeight(): scala.Unit = js.native
  def DistributeWidth(): scala.Unit = js.native
  def Item(Index: scala.Double): Cell = js.native
  def Merge(): scala.Unit = js.native
  def SetHeight(RowHeight: js.Any, HeightRule: WdRowHeightRule): scala.Unit = js.native
  def SetWidth(ColumnWidth: scala.Double, RulerStyle: WdRulerStyle): scala.Unit = js.native
  def Split(): scala.Unit = js.native
  def Split(NumRows: js.Any): scala.Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any): scala.Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any, MergeBeforeSplit: js.Any): scala.Unit = js.native
}

