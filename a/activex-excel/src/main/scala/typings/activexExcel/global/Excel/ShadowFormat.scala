package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoShadowStyle
import typings.activexOffice.Office.MsoShadowType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ShadowFormat")
@js.native
class ShadowFormat protected ()
  extends typings.activexExcel.Excel.ShadowFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var Blur: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  @JSName("Excel.ShadowFormat_typekey")
  override var ExcelDotShadowFormat_typekey: typings.activexExcel.Excel.ShadowFormat = js.native
  /* CompleteClass */
  override var ForeColor: typings.activexExcel.Excel.ColorFormat = js.native
  /* CompleteClass */
  override var Obscured: MsoTriState = js.native
  /* CompleteClass */
  override var OffsetX: Double = js.native
  /* CompleteClass */
  override var OffsetY: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RotateWithShape: MsoTriState = js.native
  /* CompleteClass */
  override var Size: Double = js.native
  /* CompleteClass */
  override var Style: MsoShadowStyle = js.native
  /* CompleteClass */
  override var Transparency: Double = js.native
  /* CompleteClass */
  override var Type: MsoShadowType = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
}

