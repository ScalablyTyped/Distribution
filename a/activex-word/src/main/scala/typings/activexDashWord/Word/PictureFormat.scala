package typings.activexDashWord.Word

import typings.activexDashOffice.Office.MsoPictureColorType
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.PictureFormat")
@js.native
class PictureFormat protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: Double = js.native
  var Crop: typings.activexDashOffice.Office.Crop = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  val Parent: js.Any = js.native
  var TransparencyColor: Double = js.native
  var TransparentBackground: MsoTriState = js.native
  var `Word.PictureFormat_typekey`: PictureFormat = js.native
  def IncrementBrightness(Increment: Double): Unit = js.native
  def IncrementContrast(Increment: Double): Unit = js.native
}

