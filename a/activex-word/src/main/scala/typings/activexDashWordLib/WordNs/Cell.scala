package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Cell")
@js.native
class Cell protected () extends js.Object {
  val Application: Application = js.native
  var Borders: Borders = js.native
  var BottomPadding: scala.Double = js.native
  val Column: Column = js.native
  val ColumnIndex: scala.Double = js.native
  val Creator: scala.Double = js.native
  var FitText: scala.Boolean = js.native
  var Height: scala.Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  var ID: java.lang.String = js.native
  var LeftPadding: scala.Double = js.native
  val NestingLevel: scala.Double = js.native
  val Next: Cell = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: scala.Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Previous: Cell = js.native
  val Range: Range = js.native
  var RightPadding: scala.Double = js.native
  val Row: Row = js.native
  val RowIndex: scala.Double = js.native
  val Shading: Shading = js.native
  val Tables: Tables = js.native
  var TopPadding: scala.Double = js.native
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  var Width: scala.Double = js.native
  var `Word.Cell_typekey`: Cell = js.native
  var WordWrap: scala.Boolean = js.native
  def AutoSum(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Delete(ShiftCells: js.Any): scala.Unit = js.native
  def Formula(): scala.Unit = js.native
  def Formula(Formula: js.Any): scala.Unit = js.native
  def Formula(Formula: js.Any, NumFormat: js.Any): scala.Unit = js.native
  def Merge(MergeTo: Cell): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def SetHeight(RowHeight: js.Any, HeightRule: WdRowHeightRule): scala.Unit = js.native
  def SetWidth(ColumnWidth: scala.Double, RulerStyle: WdRulerStyle): scala.Unit = js.native
  def Split(): scala.Unit = js.native
  def Split(NumRows: js.Any): scala.Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any): scala.Unit = js.native
}

