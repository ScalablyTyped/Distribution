package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  var AutoSize: Boolean = js.native
  
  var BackColor: Double = js.native
  
  var BackStyle: fmBackStyle = js.native
  
  var BorderColor: Double = js.native
  
  var BorderStyle: fmBorderStyle = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("MSForms.Image_typekey")
  var MSFormsDotImage_typekey: Image = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: fmMousePointer = js.native
  
  var Picture: StdPicture = js.native
  
  var PictureAlignment: fmPictureAlignment = js.native
  
  var PictureSizeMode: fmPictureSizeMode = js.native
  
  var PictureTiling: Boolean = js.native
  
  var SpecialEffect: fmSpecialEffect = js.native
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
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Double): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = this.set("BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: Double): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: fmBorderStyle): Self = this.set("BorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotImage_typekey(value: Image): Self = this.set("MSForms.Image_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: StdPicture): Self = this.set("Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureAlignment(value: fmPictureAlignment): Self = this.set("PictureAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureSizeMode(value: fmPictureSizeMode): Self = this.set("PictureSizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureTiling(value: Boolean): Self = this.set("PictureTiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialEffect(value: fmSpecialEffect): Self = this.set("SpecialEffect", value.asInstanceOf[js.Any])
  }
}
