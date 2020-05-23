package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBarBorder extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Color: FormatColor
  val Creator: XlCreator
  @JSName("Excel.DataBarBorder_typekey")
  var ExcelDotDataBarBorder_typekey: DataBarBorder
  val Parent: js.Any
  var Type: XlDataBarBorderType
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
}

