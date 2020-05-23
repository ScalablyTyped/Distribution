package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cells extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Height: Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  val NestingLevel: Double = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  var Width: Double = js.native
  @JSName("Word.Cells_typekey")
  var WordDotCells_typekey: Cells = js.native
  def Add(): Cell = js.native
  def Add(BeforeCell: js.Any): Cell = js.native
  def AutoFit(): Unit = js.native
  def Delete(): Unit = js.native
  def Delete(ShiftCells: js.Any): Unit = js.native
  def DistributeHeight(): Unit = js.native
  def DistributeWidth(): Unit = js.native
  def Item(Index: Double): Cell = js.native
  def Merge(): Unit = js.native
  def SetHeight(RowHeight: js.Any, HeightRule: WdRowHeightRule): Unit = js.native
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  def Split(): Unit = js.native
  def Split(NumRows: js.Any): Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any): Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any, MergeBeforeSplit: js.Any): Unit = js.native
}

