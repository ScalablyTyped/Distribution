package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionButton extends StObject {
  
  var Accelerator: String
  
  var Alignment: fmAlignment
  
  var AutoSize: Boolean
  
  var BackColor: Double
  
  var BackStyle: fmBackStyle
  
  var BordersSuppress: Boolean
  
  var Caption: String
  
  val DisplayStyle: fmDisplayStyle
  
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
  
  var GroupName: String
  
  var Locked: Boolean
  
  @JSName("MSForms.OptionButton_typekey")
  var MSFormsDotOptionButton_typekey: OptionButton
  
  var MouseIcon: StdPicture
  
  var MousePointer: fmMousePointer
  
  var MultiSelect: fmMultiSelect
  
  var Picture: StdPicture
  
  var PicturePosition: fmPicturePosition
  
  var SpecialEffect: fmButtonEffect
  
  var TextAlign: fmTextAlign
  
  var TripleState: Boolean
  
  val Valid: Boolean
  
  var Value: js.Any
  
  var WordWrap: Boolean
  
  val _Font_Reserved: NewFont
}
object OptionButton {
  
  @scala.inline
  def apply(
    Accelerator: String,
    Alignment: fmAlignment,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BordersSuppress: Boolean,
    Caption: String,
    DisplayStyle: fmDisplayStyle,
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
    GroupName: String,
    Locked: Boolean,
    MSFormsDotOptionButton_typekey: OptionButton,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    MultiSelect: fmMultiSelect,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    SpecialEffect: fmButtonEffect,
    TextAlign: fmTextAlign,
    TripleState: Boolean,
    Valid: Boolean,
    Value: js.Any,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): OptionButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TripleState = TripleState.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.OptionButton_typekey")(MSFormsDotOptionButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionButton]
  }
  
  @scala.inline
  implicit class OptionButtonMutableBuilder[Self <: OptionButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: fmAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersSuppress(value: Boolean): Self = StObject.set(x, "BordersSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStyle(value: fmDisplayStyle): Self = StObject.set(x, "DisplayStyle", value.asInstanceOf[js.Any])
    
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
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotOptionButton_typekey(value: OptionButton): Self = StObject.set(x, "MSForms.OptionButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: fmMultiSelect): Self = StObject.set(x, "MultiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: StdPicture): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicturePosition(value: fmPicturePosition): Self = StObject.set(x, "PicturePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialEffect(value: fmButtonEffect): Self = StObject.set(x, "SpecialEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: fmTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripleState(value: Boolean): Self = StObject.set(x, "TripleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Font_Reserved(value: NewFont): Self = StObject.set(x, "_Font_Reserved", value.asInstanceOf[js.Any])
  }
}
