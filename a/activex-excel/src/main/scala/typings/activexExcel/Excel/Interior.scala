package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interior extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Color: XlRgbColor | Double
  var ColorIndex: Double | XlColorIndex
  val Creator: XlCreator
  @JSName("Excel.Interior_typekey")
  var ExcelDotInterior_typekey: Interior
  val Gradient: js.Any
  var InvertIfNegative: Boolean
  val Parent: js.Any
  var Pattern: XlPattern
  var PatternColor: XlRgbColor | Double
  var PatternColorIndex: Double | XlColorIndex
  var PatternThemeColor: XlThemeColor
  var PatternTintAndShade: Double
  var ThemeColor: XlThemeColor
  var TintAndShade: Double
}

object Interior {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotInterior_typekey: Interior,
    Gradient: js.Any,
    InvertIfNegative: Boolean,
    Parent: js.Any,
    Pattern: XlPattern,
    PatternColor: XlRgbColor | Double,
    PatternColorIndex: Double | XlColorIndex,
    PatternThemeColor: XlThemeColor,
    PatternTintAndShade: Double,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Gradient = Gradient.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any], PatternThemeColor = PatternThemeColor.asInstanceOf[js.Any], PatternTintAndShade = PatternTintAndShade.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Interior_typekey")(ExcelDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
}

