package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeBarFormat extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val BorderColor: FormatColor
  var BorderColorType: XlDataBarNegativeColorType
  val Color: FormatColor
  var ColorType: XlDataBarNegativeColorType
  val Creator: XlCreator
  @JSName("Excel.NegativeBarFormat_typekey")
  var ExcelDotNegativeBarFormat_typekey: NegativeBarFormat
  val Parent: js.Any
}

object NegativeBarFormat {
  @scala.inline
  def apply(
    Application: Application,
    BorderColor: FormatColor,
    BorderColorType: XlDataBarNegativeColorType,
    Color: FormatColor,
    ColorType: XlDataBarNegativeColorType,
    Creator: XlCreator,
    ExcelDotNegativeBarFormat_typekey: NegativeBarFormat,
    Parent: js.Any
  ): NegativeBarFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderColorType = BorderColorType.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.NegativeBarFormat_typekey")(ExcelDotNegativeBarFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegativeBarFormat]
  }
}

