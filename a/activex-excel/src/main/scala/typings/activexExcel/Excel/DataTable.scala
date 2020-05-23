package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTable extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var AutoScaleFont: js.Any
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.DataTable_typekey")
  var ExcelDotDataTable_typekey: DataTable
  val Font: typings.activexExcel.Excel.Font
  val Format: ChartFormat
  var HasBorderHorizontal: Boolean
  var HasBorderOutline: Boolean
  var HasBorderVertical: Boolean
  val Parent: js.Any
  var ShowLegendKey: Boolean
  def Delete(): Unit
  def Select(): Unit
}

object DataTable {
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: Border,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotDataTable_typekey: DataTable,
    Font: Font,
    Format: ChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    Parent: js.Any,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): DataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataTable_typekey")(ExcelDotDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
}

