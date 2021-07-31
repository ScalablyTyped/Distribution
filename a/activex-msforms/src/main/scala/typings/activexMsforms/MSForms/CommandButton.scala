package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandButton extends StObject {
  
  var Accelerator: String
  
  var AutoSize: Boolean
  
  var BackColor: Double
  
  var BackStyle: fmBackStyle
  
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
  
  var Locked: Boolean
  
  @JSName("MSForms.CommandButton_typekey")
  var MSFormsDotCommandButton_typekey: CommandButton
  
  var MouseIcon: StdPicture
  
  var MousePointer: fmMousePointer
  
  var Picture: StdPicture
  
  var PicturePosition: fmPicturePosition
  
  var TakeFocusOnClick: Boolean
  
  var Value: Boolean
  
  var WordWrap: Boolean
  
  val _Font_Reserved: NewFont
}
object CommandButton {
  
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
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
    Locked: Boolean,
    MSFormsDotCommandButton_typekey: CommandButton,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    TakeFocusOnClick: Boolean,
    Value: Boolean,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): CommandButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], TakeFocusOnClick = TakeFocusOnClick.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.CommandButton_typekey")(MSFormsDotCommandButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandButton]
  }
  
  @scala.inline
  implicit class CommandButtonMutableBuilder[Self <: CommandButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: NewFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBold(value: Boolean): Self = StObject.set(x, "FontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontItalic(value: Boolean): Self = StObject.set(x, "FontItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStrikethru(value: Boolean): Self = StObject.set(x, "FontStrikethru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUnderline(value: Boolean): Self = StObject.set(x, "FontUnderline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "FontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotCommandButton_typekey(value: CommandButton): Self = StObject.set(x, "MSForms.CommandButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: StdPicture): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicturePosition(value: fmPicturePosition): Self = StObject.set(x, "PicturePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeFocusOnClick(value: Boolean): Self = StObject.set(x, "TakeFocusOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Font_Reserved(value: NewFont): Self = StObject.set(x, "_Font_Reserved", value.asInstanceOf[js.Any])
  }
}
