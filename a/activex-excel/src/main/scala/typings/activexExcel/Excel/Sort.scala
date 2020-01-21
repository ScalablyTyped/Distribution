package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Sort")
@js.native
class Sort protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Sort_typekey")
  var ExcelDotSort_typekey: Sort = js.native
  var Header: XlYesNoGuess = js.native
  var MatchCase: Boolean = js.native
  var Orientation: XlSortOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("Rng")
  val Rng_Original: Range = js.native
  @JSName("SortFields")
  val SortFields_Original: SortFields = js.native
  var SortMethod: XlSortMethod = js.native
  def Apply(): Unit = js.native
  def Rng(Address: String): Range = js.native
  def Rng(RowIndex: Double): Range = js.native
  def Rng(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def SetRange(Rng: Range): Unit = js.native
  def SortFields(Index: js.Any): SortField = js.native
}

