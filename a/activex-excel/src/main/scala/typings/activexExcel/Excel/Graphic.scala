package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// there is no way to use the Globals class from within Javascript
@JSGlobal("Excel.Graphic")
@js.native
class Graphic protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: XlCreator = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  @JSName("Excel.Graphic_typekey")
  var ExcelDotGraphic_typekey: Graphic = js.native
  var Filename: String = js.native
  var Height: Double = js.native
  var LockAspectRatio: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Width: Double = js.native
}

