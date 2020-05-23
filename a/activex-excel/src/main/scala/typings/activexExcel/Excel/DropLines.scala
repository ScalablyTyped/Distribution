package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropLines extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.DropLines_typekey")
  var ExcelDotDropLines_typekey: DropLines
  val Format: ChartFormat
  val Name: String
  val Parent: js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object DropLines {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotDropLines_typekey: DropLines,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): DropLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.DropLines_typekey")(ExcelDotDropLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLines]
  }
}

