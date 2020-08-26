package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandButton extends js.Object {
  var Accelerator: String = js.native
  var AutoSize: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var Caption: String = js.native
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
  var Locked: Boolean = js.native
  @JSName("MSForms.CommandButton_typekey")
  var MSFormsDotCommandButton_typekey: CommandButton = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var Picture: StdPicture = js.native
  var PicturePosition: fmPicturePosition = js.native
  var TakeFocusOnClick: Boolean = js.native
  var Value: Boolean = js.native
  var WordWrap: Boolean = js.native
  val _Font_Reserved: NewFont = js.native
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
  implicit class CommandButtonOps[Self <: CommandButton] (val x: Self) extends AnyVal {
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
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackColor(value: Double): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = this.set("BackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
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
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSFormsDotCommandButton_typekey(value: CommandButton): Self = this.set("MSForms.CommandButton_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: StdPicture): Self = this.set("Picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicturePosition(value: fmPicturePosition): Self = this.set("PicturePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTakeFocusOnClick(value: Boolean): Self = this.set("TakeFocusOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Font_Reserved(value: NewFont): Self = this.set("_Font_Reserved", value.asInstanceOf[js.Any])
  }
  
}

