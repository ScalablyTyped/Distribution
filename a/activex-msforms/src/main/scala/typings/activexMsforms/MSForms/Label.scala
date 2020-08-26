package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var Accelerator: String = js.native
  var AutoSize: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
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
  @JSName("MSForms.Label_typekey")
  var MSFormsDotLabel_typekey: Label = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var Picture: StdPicture = js.native
  var PicturePosition: fmPicturePosition = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var TextAlign: fmTextAlign = js.native
  var WordWrap: Boolean = js.native
  val _Font_Reserved: NewFont = js.native
  var _Value: String = js.native
}

object Label {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: Double): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: fmBorderStyle): Self = this.set("BorderStyle", value.asInstanceOf[js.Any])
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
    def setMSFormsDotLabel_typekey(value: Label): Self = this.set("MSForms.Label_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: StdPicture): Self = this.set("Picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicturePosition(value: fmPicturePosition): Self = this.set("PicturePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecialEffect(value: fmSpecialEffect): Self = this.set("SpecialEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: fmTextAlign): Self = this.set("TextAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Font_Reserved(value: NewFont): Self = this.set("_Font_Reserved", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Value(value: String): Self = this.set("_Value", value.asInstanceOf[js.Any])
  }
  
}

