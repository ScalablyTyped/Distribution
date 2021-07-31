package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
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
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: fmBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotImage_typekey(value: Image): Self = StObject.set(x, "MSForms.Image_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: StdPicture): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureAlignment(value: fmPictureAlignment): Self = StObject.set(x, "PictureAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureSizeMode(value: fmPictureSizeMode): Self = StObject.set(x, "PictureSizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureTiling(value: Boolean): Self = StObject.set(x, "PictureTiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialEffect(value: fmSpecialEffect): Self = StObject.set(x, "SpecialEffect", value.asInstanceOf[js.Any])
  }
}
