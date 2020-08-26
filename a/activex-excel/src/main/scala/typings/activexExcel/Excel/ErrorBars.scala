package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBars extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  var EndStyle: XlEndStyleCap = js.native
  @JSName("Excel.ErrorBars_typekey")
  var ExcelDotErrorBars_typekey: ErrorBars = js.native
  val Format: ChartFormat = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
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
  @scala.inline
  implicit class ErrorBarsOps[Self <: ErrorBars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: Border): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = this.set("ClearFormats", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEndStyle(value: XlEndStyleCap): Self = this.set("EndStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotErrorBars_typekey(value: ErrorBars): Self = this.set("Excel.ErrorBars_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
  }
  
}

