package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PictureFormat")
@js.native
class PictureFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: Double = js.native
  val Crop: typings.activexDashOffice.Office.Crop = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  @JSName("Office.PictureFormat_typekey")
  var OfficeDotPictureFormat_typekey: PictureFormat = js.native
  val Parent: js.Any = js.native
  var TransparencyColor: Double = js.native
  var TransparentBackground: MsoTriState = js.native
  def IncrementBrightness(Increment: Double): Unit = js.native
  def IncrementContrast(Increment: Double): Unit = js.native
}

