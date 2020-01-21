package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DataTable")
@js.native
class DataTable protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DataTable_typekey")
  var ExcelDotDataTable_typekey: DataTable = js.native
  val Font: typings.activexExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  var HasBorderHorizontal: Boolean = js.native
  var HasBorderOutline: Boolean = js.native
  var HasBorderVertical: Boolean = js.native
  val Parent: js.Any = js.native
  var ShowLegendKey: Boolean = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

