package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Sparkline")
@js.native
class Sparkline protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Sparkline_typekey")
  var ExcelDotSparkline_typekey: Sparkline = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  val Parent: js.Any = js.native
  var SourceData: String = js.native
  def Location(Address: String): Range = js.native
  def Location(RowIndex: Double): Range = js.native
  def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def ModifyLocation(Range: Range): Unit = js.native
  def ModifySourceData(Formula: String): Unit = js.native
}

