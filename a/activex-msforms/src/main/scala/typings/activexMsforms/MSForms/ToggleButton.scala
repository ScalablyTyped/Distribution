package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToggleButton extends js.Object {
  
  var Accelerator: String = js.native
  
  var Alignment: fmAlignment = js.native
  
  var AutoSize: Boolean = js.native
  
  var BackColor: Double = js.native
  
  var BackStyle: fmBackStyle = js.native
  
  var BordersSuppress: Boolean = js.native
  
  var Caption: String = js.native
  
  val DisplayStyle: fmDisplayStyle = js.native
  
  var Enabled: Boolean = js.native
  
  var Font: NewFont = js.native
  
  var FontBold: Boolean = js.native
  
  var FontItalic: Boolean = js.native
  
  var FontName: String = js.native
  
  var FontSize: Double = js.native
  
  var FontStrikethru: Boolean = js.native
  
  var FontUnderline: Boolean = js.native
  
  var FontWeight: Double = js.native
  
  var ForeColor: Double = js.native
  
  var GroupName: String = js.native
  
  var Locked: Boolean = js.native
  
  @JSName("MSForms.ToggleButton_typekey")
  var MSFormsDotToggleButton_typekey: ToggleButton = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: fmMousePointer = js.native
  
  var MultiSelect: fmMultiSelect = js.native
  
  var Picture: StdPicture = js.native
  
  var PicturePosition: fmPicturePosition = js.native
  
  var SpecialEffect: fmButtonEffect = js.native
  
  var TextAlign: fmTextAlign = js.native
  
  var TripleState: Boolean = js.native
  
  val Valid: Boolean = js.native
  
  var Value: js.Any = js.native
  
  var WordWrap: Boolean = js.native
  
  val _Font_Reserved: NewFont = js.native
}
object ToggleButton {
  
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
    MSFormsDotToggleButton_typekey: ToggleButton,
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
  ): ToggleButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TripleState = TripleState.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ToggleButton_typekey")(MSFormsDotToggleButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleButton]
  }
  
  @scala.inline
  implicit class ToggleButtonOps[Self <: ToggleButton] (val x: Self) extends AnyVal {
    
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
    def setAccelerator(value: String): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: fmAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Double): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = this.set("BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersSuppress(value: Boolean): Self = this.set("BordersSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStyle(value: fmDisplayStyle): Self = this.set("DisplayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: NewFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBold(value: Boolean): Self = this.set("FontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontItalic(value: Boolean): Self = this.set("FontItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = this.set("FontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStrikethru(value: Boolean): Self = this.set("FontStrikethru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUnderline(value: Boolean): Self = this.set("FontUnderline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("FontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: Double): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotToggleButton_typekey(value: ToggleButton): Self = this.set("MSForms.ToggleButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: fmMultiSelect): Self = this.set("MultiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: StdPicture): Self = this.set("Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicturePosition(value: fmPicturePosition): Self = this.set("PicturePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialEffect(value: fmButtonEffect): Self = this.set("SpecialEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: fmTextAlign): Self = this.set("TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripleState(value: Boolean): Self = this.set("TripleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Font_Reserved(value: NewFont): Self = this.set("_Font_Reserved", value.asInstanceOf[js.Any])
  }
}
