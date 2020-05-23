package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// there is no way to use the Globals class from within Javascript
@JSGlobal("Excel.Graphic")
@js.native
class Graphic protected ()
  extends typings.activexExcel.Excel.Graphic {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Brightness: Double = js.native
  /* CompleteClass */
  override var ColorType: MsoPictureColorType = js.native
  /* CompleteClass */
  override var Contrast: Double = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var CropBottom: Double = js.native
  /* CompleteClass */
  override var CropLeft: Double = js.native
  /* CompleteClass */
  override var CropRight: Double = js.native
  /* CompleteClass */
  override var CropTop: Double = js.native
  /* CompleteClass */
  @JSName("Excel.Graphic_typekey")
  override var ExcelDotGraphic_typekey: typings.activexExcel.Excel.Graphic = js.native
  /* CompleteClass */
  override var Filename: String = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  override var LockAspectRatio: MsoTriState = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Width: Double = js.native
}

