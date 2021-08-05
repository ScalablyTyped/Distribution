package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var Accelerator: String
  
  var AutoSize: Boolean
  
  var BackColor: Double
  
  var BackStyle: fmBackStyle
  
  var BorderColor: Double
  
  var BorderStyle: fmBorderStyle
  
  var Caption: String
  
  var Enabled: Boolean
  
  var Font: NewFont
  
  var FontBold: Boolean
  
  var FontItalic: Boolean
  
  var FontName: String
  
  var FontSize: Double
  
  var FontStrikethru: Boolean
  
  var FontUnderline: Boolean
  
  var FontWeight: Double
  
  var ForeColor: Double
  
  /* private */ @JSName("MSForms.Label_typekey")
  var MSFormsDotLabel_typekey: Label
  
  var MouseIcon: StdPicture
  
  var MousePointer: fmMousePointer
  
  var Picture: StdPicture
  
  var PicturePosition: fmPicturePosition
  
  var SpecialEffect: fmSpecialEffect
  
  var TextAlign: fmTextAlign
  
  var WordWrap: Boolean
  
  val _Font_Reserved: NewFont
  
  var _Value: String
}
object Label {
  
  inline def apply(
    Accelerator: String,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BorderColor: Double,
    BorderStyle: fmBorderStyle,
    Caption: String,
    Enabled: Boolean,
    Font: NewFont,
    FontBold: Boolean,
    FontItalic: Boolean,
    FontName: String,
    FontSize: Double,
    FontStrikethru: Boolean,
    FontUnderline: Boolean,
    FontWeight: Double,
    ForeColor: Double,
    MSFormsDotLabel_typekey: Label,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    SpecialEffect: fmSpecialEffect,
    TextAlign: fmTextAlign,
    WordWrap: Boolean,
    _Font_Reserved: NewFont,
    _Value: String
  ): Label = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.Label_typekey")(MSFormsDotLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackStyle(value: fmBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: fmBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFont(value: NewFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFontBold(value: Boolean): Self = StObject.set(x, "FontBold", value.asInstanceOf[js.Any])
    
    inline def setFontItalic(value: Boolean): Self = StObject.set(x, "FontItalic", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setFontStrikethru(value: Boolean): Self = StObject.set(x, "FontStrikethru", value.asInstanceOf[js.Any])
    
    inline def setFontUnderline(value: Boolean): Self = StObject.set(x, "FontUnderline", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "FontWeight", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotLabel_typekey(value: Label): Self = StObject.set(x, "MSForms.Label_typekey", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: StdPicture): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    inline def setPicturePosition(value: fmPicturePosition): Self = StObject.set(x, "PicturePosition", value.asInstanceOf[js.Any])
    
    inline def setSpecialEffect(value: fmSpecialEffect): Self = StObject.set(x, "SpecialEffect", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: fmTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
    
    inline def set_Font_Reserved(value: NewFont): Self = StObject.set(x, "_Font_Reserved", value.asInstanceOf[js.Any])
    
    inline def set_Value(value: String): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
