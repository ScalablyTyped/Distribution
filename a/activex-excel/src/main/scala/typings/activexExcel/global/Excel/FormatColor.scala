package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.FormatColor")
@js.native
class FormatColor protected ()
  extends typings.activexExcel.Excel.FormatColor {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Color: XlRgbColor | Double = js.native
  /* CompleteClass */
  override var ColorIndex: XlColorIndex = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.FormatColor_typekey")
  override var ExcelDotFormatColor_typekey: typings.activexExcel.Excel.FormatColor = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var ThemeColor: XlThemeColor = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
}

