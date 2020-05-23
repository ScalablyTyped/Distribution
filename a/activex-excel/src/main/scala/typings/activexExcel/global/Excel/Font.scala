package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlBackground
import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import typings.activexExcel.Excel.XlThemeFont
import typings.activexExcel.Excel.XlUnderlineStyle
import typings.activexExcel.activexExcelStrings.Bold
import typings.activexExcel.activexExcelStrings.Italic
import typings.activexExcel.activexExcelStrings.Regular
import typings.activexExcel.activexExcelStrings.`Bold Italic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Font")
@js.native
class Font protected ()
  extends typings.activexExcel.Excel.Font {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Background: XlBackground = js.native
  /* CompleteClass */
  override var Bold: Boolean = js.native
  /* CompleteClass */
  override var Color: XlRgbColor | Double = js.native
  /* CompleteClass */
  override var ColorIndex: Double | XlColorIndex = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.Font_typekey")
  override var ExcelDotFont_typekey: typings.activexExcel.Excel.Font = js.native
  /* CompleteClass */
  override var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  /* CompleteClass */
  override var Italic: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var OutlineFont: js.Any = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Shadow: js.Any = js.native
  /* CompleteClass */
  override var Size: Double = js.native
  /* CompleteClass */
  override var Strikethrough: Boolean = js.native
  /* CompleteClass */
  override var Subscript: Boolean = js.native
  /* CompleteClass */
  override var Superscript: Boolean = js.native
  /* CompleteClass */
  override var ThemeColor: XlThemeColor = js.native
  /* CompleteClass */
  override var ThemeFont: XlThemeFont = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
  /* CompleteClass */
  override var Underline: XlUnderlineStyle = js.native
}

