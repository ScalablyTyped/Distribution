package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Cell")
@js.native
class Cell protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var Borders: typings.activexDashWord.Word.Borders = js.native
  var BottomPadding: Double = js.native
  val Column: typings.activexDashWord.Word.Column = js.native
  val ColumnIndex: Double = js.native
  val Creator: Double = js.native
  var FitText: Boolean = js.native
  var Height: Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  var ID: String = js.native
  var LeftPadding: Double = js.native
  val NestingLevel: Double = js.native
  val Next: Cell = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Previous: Cell = js.native
  val Range: typings.activexDashWord.Word.Range = js.native
  var RightPadding: Double = js.native
  val Row: typings.activexDashWord.Word.Row = js.native
  val RowIndex: Double = js.native
  val Shading: typings.activexDashWord.Word.Shading = js.native
  val Tables: typings.activexDashWord.Word.Tables = js.native
  var TopPadding: Double = js.native
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  var Width: Double = js.native
  var `Word.Cell_typekey`: Cell = js.native
  var WordWrap: Boolean = js.native
  def AutoSum(): Unit = js.native
  def Delete(): Unit = js.native
  def Delete(ShiftCells: js.Any): Unit = js.native
  def Formula(): Unit = js.native
  def Formula(Formula: js.Any): Unit = js.native
  def Formula(Formula: js.Any, NumFormat: js.Any): Unit = js.native
  def Merge(MergeTo: Cell): Unit = js.native
  def Select(): Unit = js.native
  def SetHeight(RowHeight: js.Any, HeightRule: WdRowHeightRule): Unit = js.native
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  def Split(): Unit = js.native
  def Split(NumRows: js.Any): Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any): Unit = js.native
}

