package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Color: XlRgbColor | Double
  var ColorIndex: Double | XlColorIndex
  val Creator: XlCreator
  @JSName("Excel.Border_typekey")
  var ExcelDotBorder_typekey: Border
  var LineStyle: typings.activexExcel.Excel.LineStyle
  val Parent: js.Any
  var ThemeColor: XlThemeColor
  var TintAndShade: Double
  var Weight: XlBorderWeight
}

object Border {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotBorder_typekey: Border,
    LineStyle: LineStyle,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double,
    Weight: XlBorderWeight
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Border_typekey")(ExcelDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

