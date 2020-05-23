package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFormat extends js.Object {
  val Application: js.Any
  var Brightness: Double
  var ColorType: MsoPictureColorType
  var Contrast: Double
  val Creator: Double
  val Crop: typings.activexOffice.Office.Crop
  var CropBottom: Double
  var CropLeft: Double
  var CropRight: Double
  var CropTop: Double
  @JSName("Office.PictureFormat_typekey")
  var OfficeDotPictureFormat_typekey: PictureFormat
  val Parent: js.Any
  var TransparencyColor: Double
  var TransparentBackground: MsoTriState
  def IncrementBrightness(Increment: Double): Unit
  def IncrementContrast(Increment: Double): Unit
}

object PictureFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    ColorType: MsoPictureColorType,
    Contrast: Double,
    Creator: Double,
    Crop: Crop,
    CropBottom: Double,
    CropLeft: Double,
    CropRight: Double,
    CropTop: Double,
    IncrementBrightness: Double => Unit,
    IncrementContrast: Double => Unit,
    OfficeDotPictureFormat_typekey: PictureFormat,
    Parent: js.Any,
    TransparencyColor: Double,
    TransparentBackground: MsoTriState
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PictureFormat_typekey")(OfficeDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
}

