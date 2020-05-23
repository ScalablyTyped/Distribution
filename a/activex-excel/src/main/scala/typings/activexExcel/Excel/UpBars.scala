package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpBars extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.UpBars_typekey")
  var ExcelDotUpBars_typekey: UpBars
  val Fill: ChartFillFormat
  val Format: ChartFormat
  val Interior: typings.activexExcel.Excel.Interior
  val Name: String
  val Parent: js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object UpBars {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotUpBars_typekey: UpBars,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): UpBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.UpBars_typekey")(ExcelDotUpBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpBars]
  }
}

