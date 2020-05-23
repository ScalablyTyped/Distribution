package typings.activexExcel.Excel

import typings.activexExcel.activexExcelStrings.Bold
import typings.activexExcel.activexExcelStrings.Italic
import typings.activexExcel.activexExcelStrings.Regular
import typings.activexExcel.activexExcelStrings.`Bold Italic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Background: XlBackground
  var Bold: Boolean
  var Color: XlRgbColor | Double
  var ColorIndex: Double | XlColorIndex
  val Creator: XlCreator
  @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: Font
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`)
  var Italic: Boolean
  var Name: String
  var OutlineFont: js.Any
  val Parent: js.Any
  var Shadow: js.Any
  var Size: Double
  var Strikethrough: Boolean
  var Subscript: Boolean
  var Superscript: Boolean
  var ThemeColor: XlThemeColor
  var ThemeFont: XlThemeFont
  var TintAndShade: Double
  var Underline: XlUnderlineStyle
}

object Font {
  @scala.inline
  def apply(
    Application: Application,
    Background: XlBackground,
    Bold: Boolean,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotFont_typekey: Font,
    FontStyle: Regular | Italic | Bold | (`Bold Italic`),
    Italic: Boolean,
    Name: String,
    OutlineFont: js.Any,
    Parent: js.Any,
    Shadow: js.Any,
    Size: Double,
    Strikethrough: Boolean,
    Subscript: Boolean,
    Superscript: Boolean,
    ThemeColor: XlThemeColor,
    ThemeFont: XlThemeFont,
    TintAndShade: Double,
    Underline: XlUnderlineStyle
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], ThemeFont = ThemeFont.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Font_typekey")(ExcelDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

