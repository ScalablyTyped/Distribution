package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PictureFormat")
@js.native
class PictureFormat protected ()
  extends typings.activexExcel.Excel.PictureFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var Brightness: Double = js.native
  /* CompleteClass */
  override var ColorType: MsoPictureColorType = js.native
  /* CompleteClass */
  override var Contrast: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Crop: typings.activexOffice.Office.Crop = js.native
  /* CompleteClass */
  override var CropBottom: Double = js.native
  /* CompleteClass */
  override var CropLeft: Double = js.native
  /* CompleteClass */
  override var CropRight: Double = js.native
  /* CompleteClass */
  override var CropTop: Double = js.native
  /* CompleteClass */
  @JSName("Excel.PictureFormat_typekey")
  override var ExcelDotPictureFormat_typekey: typings.activexExcel.Excel.PictureFormat = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var TransparencyColor: MsoRGBType = js.native
  /* CompleteClass */
  override var TransparentBackground: MsoTriState = js.native
  /* CompleteClass */
  override def IncrementBrightness(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementContrast(Increment: Double): Unit = js.native
}

