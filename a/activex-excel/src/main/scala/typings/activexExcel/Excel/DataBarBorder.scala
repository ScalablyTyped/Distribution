package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataBarBorder extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Color: FormatColor = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DataBarBorder_typekey")
  var ExcelDotDataBarBorder_typekey: DataBarBorder = js.native
  val Parent: js.Any = js.native
  var Type: XlDataBarBorderType = js.native
}

object DataBarBorder {
  @scala.inline
  def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotDataBarBorder_typekey: DataBarBorder,
    Parent: js.Any,
    Type: XlDataBarBorderType
  ): DataBarBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataBarBorder_typekey")(ExcelDotDataBarBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarBorder]
  }
  @scala.inline
  implicit class DataBarBorderOps[Self <: DataBarBorder] (val x: Self) extends AnyVal {
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
    def setColor(value: FormatColor): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotDataBarBorder_typekey(value: DataBarBorder): Self = this.set("Excel.DataBarBorder_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: XlDataBarBorderType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

