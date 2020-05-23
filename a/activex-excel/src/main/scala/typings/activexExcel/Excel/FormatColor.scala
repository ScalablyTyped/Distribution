package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatColor extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Color: XlRgbColor | Double
  var ColorIndex: XlColorIndex
  val Creator: XlCreator
  @JSName("Excel.FormatColor_typekey")
  var ExcelDotFormatColor_typekey: FormatColor
  val Parent: js.Any
  var ThemeColor: XlThemeColor
  var TintAndShade: Double
}

object FormatColor {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: XlColorIndex,
    Creator: XlCreator,
    ExcelDotFormatColor_typekey: FormatColor,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): FormatColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FormatColor_typekey")(ExcelDotFormatColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatColor]
  }
}

