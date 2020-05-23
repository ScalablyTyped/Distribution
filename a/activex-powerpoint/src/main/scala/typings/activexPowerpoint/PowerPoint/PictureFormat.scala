package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.Crop
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoTriState
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
  val Parent: js.Any
  @JSName("PowerPoint.PictureFormat_typekey")
  var PowerPointDotPictureFormat_typekey: PictureFormat
  var TransparencyColor: MsoRGBType
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
    Parent: js.Any,
    PowerPointDotPictureFormat_typekey: PictureFormat,
    TransparencyColor: MsoRGBType,
    TransparentBackground: MsoTriState
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PictureFormat_typekey")(PowerPointDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
}

