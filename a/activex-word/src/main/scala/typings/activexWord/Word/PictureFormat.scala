package typings.activexWord.Word

import typings.activexOffice.Office.Crop
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Brightness: Double
  var ColorType: MsoPictureColorType
  var Contrast: Double
  val Creator: Double
  var Crop: typings.activexOffice.Office.Crop
  var CropBottom: Double
  var CropLeft: Double
  var CropRight: Double
  var CropTop: Double
  val Parent: js.Any
  var TransparencyColor: Double
  var TransparentBackground: MsoTriState
  @JSName("Word.PictureFormat_typekey")
  var WordDotPictureFormat_typekey: PictureFormat
  def IncrementBrightness(Increment: Double): Unit
  def IncrementContrast(Increment: Double): Unit
}

object PictureFormat {
  @scala.inline
  def apply(
    Application: Application,
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
    TransparencyColor: Double,
    TransparentBackground: MsoTriState,
    WordDotPictureFormat_typekey: PictureFormat
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.PictureFormat_typekey")(WordDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
}

