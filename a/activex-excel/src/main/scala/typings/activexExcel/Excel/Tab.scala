package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Color: XlRgbColor | Double
  var ColorIndex: XlColorIndex
  val Creator: XlCreator
  @JSName("Excel.Tab_typekey")
  var ExcelDotTab_typekey: Tab
  val Parent: js.Any
  var ThemeColor: XlThemeColor
  var TintAndShade: Double
}

object Tab {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: XlColorIndex,
    Creator: XlCreator,
    ExcelDotTab_typekey: Tab,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Tab = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Tab_typekey")(ExcelDotTab_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

