package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var AutoSize: Boolean
  var BackColor: Double
  var BackStyle: fmBackStyle
  var BorderColor: Double
  var BorderStyle: fmBorderStyle
  var Enabled: Boolean
  @JSName("MSForms.Image_typekey")
  var MSFormsDotImage_typekey: Image
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var Picture: StdPicture
  var PictureAlignment: fmPictureAlignment
  var PictureSizeMode: fmPictureSizeMode
  var PictureTiling: Boolean
  var SpecialEffect: fmSpecialEffect
}

object Image {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BorderColor: Double,
    BorderStyle: fmBorderStyle,
    Enabled: Boolean,
    MSFormsDotImage_typekey: Image,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Picture: StdPicture,
    PictureAlignment: fmPictureAlignment,
    PictureSizeMode: fmPictureSizeMode,
    PictureTiling: Boolean,
    SpecialEffect: fmSpecialEffect
  ): Image = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureAlignment = PictureAlignment.asInstanceOf[js.Any], PictureSizeMode = PictureSizeMode.asInstanceOf[js.Any], PictureTiling = PictureTiling.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.Image_typekey")(MSFormsDotImage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

