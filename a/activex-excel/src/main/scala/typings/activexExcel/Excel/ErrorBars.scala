package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBars extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  var EndStyle: XlEndStyleCap
  @JSName("Excel.ErrorBars_typekey")
  var ExcelDotErrorBars_typekey: ErrorBars
  val Format: ChartFormat
  val Name: String
  val Parent: js.Any
  def ClearFormats(): js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object ErrorBars {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    EndStyle: XlEndStyleCap,
    ExcelDotErrorBars_typekey: ErrorBars,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): ErrorBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EndStyle = EndStyle.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.ErrorBars_typekey")(ExcelDotErrorBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBars]
  }
}

