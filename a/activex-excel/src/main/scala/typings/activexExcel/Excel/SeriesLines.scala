package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLines extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.SeriesLines_typekey")
  var ExcelDotSeriesLines_typekey: SeriesLines
  val Format: ChartFormat
  val Name: String
  val Parent: js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object SeriesLines {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotSeriesLines_typekey: SeriesLines,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): SeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.SeriesLines_typekey")(ExcelDotSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLines]
  }
}

