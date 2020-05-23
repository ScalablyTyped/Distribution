package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlBorderWeight
import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Border")
@js.native
class Border protected ()
  extends typings.activexExcel.Excel.Border {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Color: XlRgbColor | Double = js.native
  /* CompleteClass */
  override var ColorIndex: Double | XlColorIndex = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.Border_typekey")
  override var ExcelDotBorder_typekey: typings.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  override var LineStyle: typings.activexExcel.Excel.LineStyle = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var ThemeColor: XlThemeColor = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
  /* CompleteClass */
  override var Weight: XlBorderWeight = js.native
}

