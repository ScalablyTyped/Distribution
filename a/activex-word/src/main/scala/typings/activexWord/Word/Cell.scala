package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  var BottomPadding: Double = js.native
  val Column: typings.activexWord.Word.Column = js.native
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
  val Range: typings.activexWord.Word.Range = js.native
  var RightPadding: Double = js.native
  val Row: typings.activexWord.Word.Row = js.native
  val RowIndex: Double = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  val Tables: typings.activexWord.Word.Tables = js.native
  var TopPadding: Double = js.native
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  var Width: Double = js.native
  @JSName("Word.Cell_typekey")
  var WordDotCell_typekey: Cell = js.native
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

