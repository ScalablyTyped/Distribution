package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ColorFormat")
@js.native
class ColorFormat protected ()
  extends typings.activexExcel.Excel.ColorFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var Brightness: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  @JSName("Excel.ColorFormat_typekey")
  override var ExcelDotColorFormat_typekey: typings.activexExcel.Excel.ColorFormat = js.native
  /* CompleteClass */
  override var ObjectThemeColor: MsoThemeColorIndex = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RGB: MsoRGBType = js.native
  /* CompleteClass */
  override var SchemeColor: Double = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
  /* CompleteClass */
  override val Type: MsoColorType = js.native
}

